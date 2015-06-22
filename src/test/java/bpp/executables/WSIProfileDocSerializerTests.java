package bpp.executables;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bpp.util.WSIProfileDocSerializer;

public class WSIProfileDocSerializerTests {
	
	private String tmpFilePath;
	
	@Before
	public void setUp () {
		tmpFilePath = "profile.tmp";
	}
	
	@Test
	public void testSerialization() throws IOException{
		WSIProfileDocSerializer serializer = new WSIProfileDocSerializer(tmpFilePath);
		serializer.serializeAssertions();
		
		List<String> expected = Files.readAllLines(Paths.get("BpelPortabilityProfile-1.0.xml"));
		List<String> actual = Files.readAllLines(Paths.get(tmpFilePath));
		
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown () throws IOException{
		Files.delete(Paths.get(tmpFilePath));
	}

}
