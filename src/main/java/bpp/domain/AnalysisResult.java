package bpp.domain;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import bpp.domain.metrics.ActivityMetric;
import bpp.domain.metrics.BaselineMetric;
import bpp.domain.metrics.ServiceCommunicationMetric;
import bpp.domain.metrics.WeightedElementsMetric;

public class AnalysisResult {

	private HashMap<Integer, List<Warning>> warnings;

	private Path bpelFile;

	private double baseMetric;

	private double weightedElementsMetric;

	private double activityMetric;

	private double serviceCommunicationMetric;

	private int numberOfElements;

	/**
	 * @return the numberOfElements
	 */
	public int getNumberOfElements() {
		return numberOfElements;
	}

	public double getServiceCommunicationMetric() {
		return serviceCommunicationMetric;
	}

	public double getActivityMetric() {
		return activityMetric;
	}

	public double getBaseMetric() {
		return baseMetric;
	}

	public Path getBpelFile() {
		return bpelFile;
	}

	public void setBpelFile(Path bpelFile) {
		this.bpelFile = bpelFile;
	}

	public AnalysisResult() {
		warnings = new HashMap<>();
	}

	public void addViolation(TestAssertion assertion, int line, int parentLine,
			int grandParentLine) {
		if (warnings.containsKey(line)) {
			warnings.get(line).add(
					new Warning(assertion, line, parentLine, grandParentLine));
		} else {
			List<Warning> warningList = new LinkedList<>();
			warningList.add(new Warning(assertion, line, parentLine,
					grandParentLine));
			warnings.put(line, warningList);
		}
	}

	public List<Warning> getViolations() {
		List<Warning> allWarnings = new LinkedList<Warning>();
		for (List<Warning> warningsPerLine : warnings.values()) {
			allWarnings.addAll(warningsPerLine);
		}
		return allWarnings;
	}

	public Map<Integer, List<Warning>> getViolationsPerLine() {
		return warnings;
	}

	public boolean containsWarning(TestAssertion assertion) {
		for (Warning warning : getViolations()) {
			if (warning.getAssertion().equals(assertion)) {
				return true;
			}
		}
		return false;
	}

	public double getWeightedElementsMetric() {
		return weightedElementsMetric;
	}

	public void setNumberOfElements(int numOfElements) {
		baseMetric = new BaselineMetric(numOfElements, warnings).compute();
		weightedElementsMetric = new WeightedElementsMetric(numOfElements,
				warnings).compute();
		numberOfElements = numOfElements;
	}

	public void setNumberOfActivities(int numOfActivities) {
		activityMetric = new ActivityMetric(numOfActivities, warnings)
				.compute();
	}

	public void setNumberOfServiceActivities(int numOfActivities) {
		serviceCommunicationMetric = new ServiceCommunicationMetric(
				numOfActivities, warnings).compute();
	}

	public PortabilityLevel getClassification() {
		PortabilityLevel result = PortabilityLevel.PORTABLE;
		for (Warning warning : getViolations()) {
			PortabilityLevel level = warning.getAssertion().getLevel();
			if (result.compareTo(level) <= -1) {
				result = level;
			}
		}
		return result;
	}

}
