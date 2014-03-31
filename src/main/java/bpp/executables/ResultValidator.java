package bpp.executables;

import java.util.ArrayList;
import java.util.List;

import bpp.domain.AnalysisResult;

public class ResultValidator {

	public boolean hasMissingValues(AnalysisResult analysisResult) {
		List<Double> valuesToCheck = new ArrayList<>(5);

		valuesToCheck.add(new Double(analysisResult.getNumberOfElements()));
		valuesToCheck.add(analysisResult.getActivityPortabilityMetric());
		valuesToCheck.add(analysisResult.getBasicPortabilityMetric());
		valuesToCheck.add(analysisResult
				.getServiceCommunicationPortabilityMetric());
		valuesToCheck.add(analysisResult.getWeightedElementsMetric());

		for (Double value : valuesToCheck) {
			if (Double.isNaN(value) || Double.isInfinite(value)) {
				return true;
			}
		}
		return false;
	}
}
