package bpp.domain.metrics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import bpp.domain.Warning;
import bpp.domain.assertions.TestAssertion;

public class ServiceCommunicationPortabilityMetric implements PortabilityMetric {

	private int numOfActivities;

	private HashMap<Integer, List<Warning>> warnings;

	public ServiceCommunicationPortabilityMetric(int numOfActivities,
			HashMap<Integer, List<Warning>> warnings) {
		this.numOfActivities = numOfActivities;
		this.warnings = warnings;
	}

	@Override
	public double compute() {
		HashMap<Integer, List<Warning>> warningsPerActivity = groupByActivity(warnings);
		double cNew = numOfActivities * TestAssertion.NUMBER_OF_ENGINES;
		double cPort = 0;
		for (List<Warning> activityWarnings : warningsPerActivity.values()) {
			cPort += getMaxDegree(activityWarnings);
		}
		double activityMeasure = 1 - (cPort / cNew);
		return activityMeasure;
	}

	private int getMaxDegree(List<Warning> warningsPerActivity) {
		int max = 0;
		for (Warning warning : warningsPerActivity) {
			int degree = warning.getAssertion().getDegree();
			if (degree > max) {
				max = degree;
			}
		}
		return max;
	}

	private HashMap<Integer, List<Warning>> groupByActivity(
			HashMap<Integer, List<Warning>> toGroup) {
		HashMap<Integer, List<Warning>> result = new HashMap<>();
		for (List<Warning> warningList : warnings.values()) {
			for (Warning warning : warningList) {
				if (warning.getAssertion().isTestsServiceActivity()) {
					int line = selectNumber(result, warning);
					putInMap(result, line, warning);
				}
			}
		}
		return result;
	}

	private int selectNumber(HashMap<Integer, List<Warning>> result,
			Warning warning) {
		int line = 0;
		switch (warning.getAssertion().getType()) {
		case CONSTRUCT:
			break;
		case ACTIVITY:
			line = warning.getLine();
			break;
		case ACTIVITY_CHILD:
			line = warning.getParentLine();
			break;
		case ACTIVITY_GRANDCHILD:
			line = warning.getGrandparentLine();
			break;
		}
		return line;
	}

	private void putInMap(HashMap<Integer, List<Warning>> result, int line,
			Warning warning) {
		if (line == 0) {
			// no activity, return
		} else if (result.get(line) != null) {
			// list for this activity exists, put it in the list
			result.get(line).add(warning);
		} else {
			// list for this activity does not exist, create new one and put the
			// warning in there
			List<Warning> list = new LinkedList<Warning>();
			list.add(warning);
			result.put(line, list);
		}
	}

	public static String getLabel() {
		return "Ms";
	}

}
