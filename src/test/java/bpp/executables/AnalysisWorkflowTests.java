package bpp.executables;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AnalysisWorkflowTests {

	@Test
	public void parseTestFilesDirectory() throws IOException {
		AnalysisWorkflow workflow = new AnalysisWorkflow(
				Paths.get("src/main/resources/testfiles"), true);
		workflow.start();

		// first result
		assertFileContentEquality(
				Paths.get("src/test/java/bpp/executables/report1.xml"),
				Paths.get("src/main/resources/testfiles/Test1-report.xml"));

		// second result
		assertFileContentEquality(
				Paths.get("src/test/java/bpp/executables/report2.xml"),
				Paths.get("src/main/resources/testfiles/Test2-report.xml"));
	}

	private void assertFileContentEquality(Path expected, Path actual)
			throws IOException {
		List<String> expectedLines = purgeTimeStamps(Files
				.readAllLines(expected));
		List<String> actualLines = purgeTimeStamps(Files.readAllLines(actual));

		assertEquals("Expected lines: " + expectedLines.size()
				+ "; Actual lines: " + actualLines.size(),
				expectedLines.size(), actualLines.size());
		for (int i = 0; i < expectedLines.size(); i++) {
			String expectedLine = expectedLines.get(i);
			String actualLine = actualLines.get(i);
			assertEquals("Expected: " + expectedLine + "; Actual: "
					+ actualLine, expectedLine, actualLine);
		}
	}

	private List<String> purgeTimeStamps(List<String> toPurge) {
		List<String> result = new ArrayList<>(toPurge.size());

		for (String line : toPurge) {
			if (!line.toLowerCase().contains("timestamp")) {
				result.add(line);
			}
		}

		return result;
	}

}
