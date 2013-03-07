package bpp.executables;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import bpp.domain.AnalysisResult;
import bpp.exceptions.AnalysisException;
import bpp.util.AggregatedResultsWriter;
import bpp.util.reporting.WSIReportWriter;

public class AnalysisWorkflow {

	private static final String RESULTS_FILE = "results.csv";

	private Path root;

	private Map<String, AnalysisResult> results;

	public AnalysisWorkflow(Path root) {
		this.root = root;
		results = new HashMap<String, AnalysisResult>();
	}

	public void start() {
		if (!Files.isDirectory(root)) {
			parseFile(root.toString());
		} else {
			parseDirectory(root);
		}
		writeAggregatedResults();
	}

	private void parseDirectory(Path directory) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
			for (Path path : stream) {
				if (Files.isRegularFile(path)
						&& path.toString().endsWith(".bpel")) {
					parseFile(path.toString());
				} else if (Files.isDirectory(path)) {
					parseDirectory(path);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void parseFile(String filePath) {
		System.out.println(getTimestamp() + "Analyzing " + filePath);

		AnalysisResult result = null;
		try {
			result = analyzeProcess(filePath);
		} catch (AnalysisException e) {
			System.err.println(e.getMessage());
			return;
		}

		results.put(filePath, result);
		String resultFilePath = filePath.substring(0, filePath.length() - 5)
				+ "-report.xml";

		System.out.println(getTimestamp() + "Writing result to "
				+ resultFilePath);
		writeResult(result, resultFilePath);
	}

	private AnalysisResult analyzeProcess(String filePath) {
		FileAnalyzer analyzer = new FileAnalyzer(filePath);
		return analyzer.analyze();
	}

	private void writeResult(AnalysisResult result, String filePath) {
		WSIReportWriter writer = new WSIReportWriter(result);
		writer.writeResult(filePath);
	}

	private void writeAggregatedResults() {
		AggregatedResultsWriter writer = new AggregatedResultsWriter(results);
		writer.writeToFile(RESULTS_FILE);
	}

	private String getTimestamp() {
		return "["
				+ DateFormat.getInstance().format(
						new Date(System.currentTimeMillis())) + "] ";
	}

}
