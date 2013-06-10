package bpp.domain;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import bpp.domain.metrics.ActivityPortabilityMetric;
import bpp.domain.metrics.BasicPortabilityMetric;
import bpp.domain.metrics.ServiceCommunicationPortabilityMetric;
import bpp.domain.metrics.WeightedElementsPortabilityMetric;

public class AnalysisResult {

	private HashMap<Integer, List<Warning>> warnings;

	private Path bpelFile;

	private double basicPortabilityMetric;

	private double weightedElementsPortabilityMetric;

	private double activityPortabilityMetric;

	private double serviceCommunicationPortabilityMetric;

	private int numberOfElements;

	/**
	 * @return the numberOfElements
	 */
	public int getNumberOfElements() {
		return numberOfElements;
	}

	public double getServiceCommunicationPortabilityMetric() {
		return serviceCommunicationPortabilityMetric;
	}

	public double getActivityPortabilityMetric() {
		return activityPortabilityMetric;
	}

	public double getBasicPortabilityMetric() {
		return basicPortabilityMetric;
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
		return weightedElementsPortabilityMetric;
	}

	public void setNumberOfElements(int numOfElements) {
		basicPortabilityMetric = new BasicPortabilityMetric(numOfElements,
				warnings).compute();
		weightedElementsPortabilityMetric = new WeightedElementsPortabilityMetric(
				numOfElements, warnings).compute();
		numberOfElements = numOfElements;
	}

	public void setNumberOfActivities(int numOfActivities) {
		activityPortabilityMetric = new ActivityPortabilityMetric(
				numOfActivities, warnings).compute();
	}

	public void setNumberOfServiceActivities(int numOfActivities) {
		serviceCommunicationPortabilityMetric = new ServiceCommunicationPortabilityMetric(
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
