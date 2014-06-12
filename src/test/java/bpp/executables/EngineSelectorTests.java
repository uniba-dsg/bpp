package bpp.executables;

import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import bpp.exceptions.AnalysisException;

public class EngineSelectorTests {
	
	EngineSelector selector;
	
	@Before
	public void setUp(){
		selector = new EngineSelector();
	}
	

	@Test(expected=IllegalArgumentException.class)
	public void testGetNumberOfAssertionsWrongEngine(){
		selector.getNumberOfSupportedAssertions("asdf");
	}
	
	@Test(expected=AnalysisException.class)
	public void testInvalidBpelFile(){
		selector.getNonSupportingEngines(Paths.get("asdf"));
	}
	
	@Test
	public void bpelgShouldBeBetterThanPetals(){
		long bpelg = selector.getNumberOfSupportedAssertions("bpelg");
		long petals = selector.getNumberOfSupportedAssertions("petalsesb");
		assertTrue(bpelg > petals);
	}
}
