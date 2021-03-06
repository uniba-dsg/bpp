package bpp.executables;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import bpp.domain.AnalysisResult;
import bpp.domain.Warning;

public class FileAnalyzerTests {

	private final double epsilon = 0.001;

	@Test
	public void test1() {
		FileAnalyzer sut = new FileAnalyzer(
				"src/main/resources/testfiles/Test1.bpel", false);
		AnalysisResult result = sut.analyze();
		assertDoubleEquals(0.893, result.getBasicPortabilityMetric());
		assertDoubleEquals(0.917, result.getWeightedElementsMetric());
		assertDoubleEquals(0.944, result.getActivityPortabilityMetric());
		assertDoubleEquals(0.888,
				result.getServiceCommunicationPortabilityMetric());
	}

	@Test
	public void test2() {
		FileAnalyzer sut = new FileAnalyzer(
				"src/main/resources/testfiles/Test2.bpel", false);
		AnalysisResult result = sut.analyze();
		assertDoubleEquals(0.857, result.getBasicPortabilityMetric());
		assertDoubleEquals(0.904, result.getWeightedElementsMetric());
		assertDoubleEquals(0.904, result.getActivityPortabilityMetric());
		assertDoubleEquals(0.722,
				result.getServiceCommunicationPortabilityMetric());
	}

	@Test
	public void testNumberOfWarnings() {
		FileAnalyzer sut = new FileAnalyzer(
				"src/main/resources/language-features/basic-activities/Validate.bpel",
				false);
		List<Warning> warnings = sut.analyze().getViolations();
		assertEquals(1, warnings.size());
	}

	private void assertDoubleEquals(double expected, double actual) {
		assertEquals(expected, actual, epsilon);
	}
}
