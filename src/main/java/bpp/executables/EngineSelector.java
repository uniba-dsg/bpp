package bpp.executables;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import bpp.domain.Warning;
import bpp.domain.assertions.Engines;
import bpp.domain.assertions.TestAssertions;

public class EngineSelector {

	public EngineSelector() {

	}

	public List<String> getSupportingEngines(Path bpelFile) {
		FileAnalyzer bppAnalyzer = new FileAnalyzer(bpelFile.toString(), false);
		List<Warning> warnings = bppAnalyzer.analyze().getViolations();
		List<Engines> supportingEngines = getEnginesAsList();

		warnings.forEach(warning -> warning.getAssertion()
				.getNotSupportingEngines().stream()
				.filter(engine -> supportingEngines.contains(engine))
				.forEach(engine -> supportingEngines.remove(engine)));

		return toStringList(new ArrayList<>(supportingEngines));
	}

	public List<String> getNonSupportingEngines(Path bpelFile) {
		FileAnalyzer bppAnalyzer = new FileAnalyzer(bpelFile.toString(), false);
		List<Warning> warnings = bppAnalyzer.analyze().getViolations();
		List<Engines> notSupportingEngines = new ArrayList<>();

		warnings.forEach(warning -> warning.getAssertion()
				.getNotSupportingEngines().stream()
				.filter(engine -> !notSupportingEngines.contains(engine))
				.forEach(engine -> notSupportingEngines.add(engine)));

		return toStringList(notSupportingEngines);
	}

	public long getNumberOfSupportedAssertions(String engineName) {
		Engines engine = Engines.getEngineFromString(engineName);

		return new TestAssertions()
				.createAll()
				.parallelStream()
				.filter(assertion -> assertion.getSupportingEngines().contains(
						engine)).count();
	}

	private List<String> toStringList(List<Engines> engines) {
		List<String> result = new ArrayList<>(engines.size());

		engines.stream().forEach(engine -> result.add(engine.toString()));

		return result;
	}

	private List<Engines> getEnginesAsList() {
		Engines[] arrayOfEngines = Engines.values();
		List<Engines> engines = new ArrayList<>(arrayOfEngines.length);
		for (Engines engine : arrayOfEngines) {
			engines.add(engine);
		}
		return engines;
	}

}
