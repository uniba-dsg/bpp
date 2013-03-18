package bpp.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

import bpp.domain.AnalysisResult;

public class AggregatedResultsWriter {

	private Map<String, AnalysisResult> results;

	private static final String CSV_SEPARATOR = ";";

	private static final String R_SEPARATOR = ",";

	public AggregatedResultsWriter(Map<String, AnalysisResult> results) {
		this.results = results;
	}

	public void writeToFile(String path) {
		writeCSV(path, CSV_SEPARATOR);
		writeCSV("r-" + path, R_SEPARATOR);
	}

	private void writeCSV(String path, String separator) {
		try (PrintWriter writer = new PrintWriter(path)) {
			writer.println("file" + separator + "class" + separator
					+ "base" + separator + "weightedElements" + separator
					+ "activity" + separator + "serviceCommunication"
					+ separator + "group" + separator + "total" + separator
					+ "elements");
			for (String file : results.keySet()) {
				writeLine(writer, file, separator);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error writing aggregated results: "
					+ e.getMessage());
		}
	}

	private void writeLine(PrintWriter writer, String file, String separator) {
		AnalysisResult result = results.get(file);
		writer.println(file + separator + result.getClassification()
				+ separator + result.getBaseMetric() + separator
				+ result.getWeightedElementsMetric() + separator
				+ result.getActivityMetric() + separator
				+ result.getServiceCommunicationMetric() + separator
				+ getGroupString(file) + separator
				+ result.getViolations().size() + separator
				+ result.getNumberOfElements());
	}

	private String getGroupString(String file) {
		String group = "Misc";
		if (file.contains("ODE")) {
			group = "ODE";
		} else if (file.contains("ActiveBPEL")) {
			group = "ActiveBPEL";
		} else if (file.contains("Oracle")) {
			group = "Oracle";
		}
		return group;
	}
}
