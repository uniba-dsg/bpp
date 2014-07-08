package bpp.executables;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import bpp.exceptions.AnalysisException;

public class EngineSelectorTests {

	EngineSelector selector;

	@Before
	public void setUp() {
		selector = new EngineSelector();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetNumberOfAssertionsWrongEngine() {
		selector.getNumberOfSupportedAssertions("asdf");
	}

	@Test(expected = AnalysisException.class)
	public void testInvalidBpelFile() {
		selector.getNonSupportingEngines(Paths.get("asdf"));
	}

	@Test
	public void bpelgShouldBeBetterThanPetals() {
		long bpelg = selector.getNumberOfSupportedAssertions("bpelg");
		long petals = selector.getNumberOfSupportedAssertions("petalsesb");
		assertTrue(bpelg > petals);
	}

	@Test
	public void testValidateSupportingEngines() {
		for (int i = 0; i < 100; i++) {
			int numberOfEngines = selector
					.getSupportingEngines(
							Paths.get("src/main/resources/language-features/basic-activities/Validate.bpel"))
					.size();
			assertEquals(6, numberOfEngines);
		}
	}
	
	@Test
	public void testValidateNonSupportingEngines() {
		for (int i = 0; i < 100; i++) {
			int numberOfEngines = selector
					.getNonSupportingEngines(
							Paths.get("src/main/resources/language-features/basic-activities/Validate.bpel"))
					.size();
			assertEquals(10, numberOfEngines);
		}
	}
}
