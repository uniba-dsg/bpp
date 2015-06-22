package bpp.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LatexSerializerTests {

	private String tmpFilePath;

	@Before
	public void setUp() {
		tmpFilePath = "tables.tmp";
	}

	@Test
	public void testTableGeneration() throws IOException {
		LatexSerializer serializer = new LatexSerializer(true, tmpFilePath);
		serializer.serializeAssertions(true);

		List<String> expected = Files.readAllLines(Paths
				.get("src/test/java/bpp/util/expected.tex"));
		List<String> actual = Files.readAllLines(Paths.get(tmpFilePath));

		assertEquals(expected, actual);
	}

	@After
	public void tearDown() throws IOException {
		Files.delete(Paths.get(tmpFilePath));
	}

}
