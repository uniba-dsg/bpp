package bpp.executables;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bpp.domain.Warning;
import bpp.domain.assertions.Engines;

public class EngineSelector {

	public EngineSelector() {

	}

	public List<String> getSupportingEngines(Path bpelFile) {
		FileAnalyzer bppAnalyzer = new FileAnalyzer(bpelFile.toString(), false);
		List<Warning> warnings = bppAnalyzer.analyze().getViolations();
		List<Engines> supportingEngines = getEnginesAsList();

		warnings.forEach(warning -> warning.getAssertion()
				.getNotSupportingEngines()
				.forEach(engine -> supportingEngines.remove(engine)));

		return toStringList(supportingEngines);
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

	private List<Engines> getEnginesAsList() {
		Engines[] arrayOfEngines = Engines.values();

		return Arrays.asList(arrayOfEngines);
	}

	private List<String> toStringList(List<Engines> engines) {
		List<String> result = new ArrayList<>(engines.size());

		engines.parallelStream().forEach(
				engine -> result.add(engine.toString()));

		return result;
	}
}
