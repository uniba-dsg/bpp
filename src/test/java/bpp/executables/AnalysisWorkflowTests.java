package bpp.executables;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
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
		
		//first result
		List<String> expected = purgeTimeStamps(Files.readAllLines(Paths.get("src/test/java/bpp/executables/report1.xml")));
		List<String> actual = purgeTimeStamps(Files.readAllLines(Paths.get("src/main/resources/testfiles/Test1-report.xml")));
		
		assertEquals(expected, actual);
		
		//second result
		expected = purgeTimeStamps(Files.readAllLines(Paths.get("src/test/java/bpp/executables/report2.xml")));
		actual = purgeTimeStamps(Files.readAllLines(Paths.get("src/main/resources/testfiles/Test2-report.xml")));
		
		assertEquals(expected, actual);
	}
	
	private List<String> purgeTimeStamps(List<String> toPurge){
		List<String> result = new ArrayList<>(toPurge.size());
		
		for(String line: toPurge){
			if(!line.toLowerCase().contains("timestamp")){
				result.add(line);
			}
		}
		
		return result;
	}

}
