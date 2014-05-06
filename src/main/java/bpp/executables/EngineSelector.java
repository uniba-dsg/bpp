package bpp.executables;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import bpp.domain.Warning;
import bpp.domain.assertions.Engines;

public class EngineSelector {

	public static void main(String[] args) {
		EngineSelector selector = new EngineSelector();
		List<String> engines = selector
				.getNonSupportingEngines(Paths
						.get("src/main/resources/language-features/basic-activities/Assign-Int.bpel"));
		for (String engine : engines) {
			System.out.println(engine);
		}
	}

	public EngineSelector() {

	}

	public List<String> getSupportingEngines(Path bpelFile) {
		FileAnalyzer bppAnalyzer = new FileAnalyzer(bpelFile.toString(), false);
		List<Warning> warnings = bppAnalyzer.analyze().getViolations();

		List<Engines> supportingEngines = getEnginesAsList();

		for (Warning warning : warnings) {
			for (Engines engine : warning.getAssertion()
					.getNotSupportingEngines()) {
				supportingEngines.remove(engine);
			}
		}

		return toStringList(supportingEngines);
	}

	public List<String> getNonSupportingEngines(Path bpelFile) {
		FileAnalyzer bppAnalyzer = new FileAnalyzer(bpelFile.toString(), false);
		List<Warning> warnings = bppAnalyzer.analyze().getViolations();

		List<Engines> notSupportingEngines = new ArrayList<>();

		for (Warning warning : warnings) {
			for (Engines engine : warning.getAssertion()
					.getNotSupportingEngines()) {
				if (!notSupportingEngines.contains(engine)) {
					notSupportingEngines.add(engine);
				}
			}
		}

		return toStringList(notSupportingEngines);
	}

	private List<Engines> getEnginesAsList() {
		Engines[] arrayOfEngines = Engines.values();
		List<Engines> engines = new ArrayList<>(arrayOfEngines.length);
		for (Engines engine : arrayOfEngines) {
			engines.add(engine);
		}
		return engines;
	}

	private List<String> toStringList(List<Engines> engines) {
		List<String> result = new ArrayList<>(engines.size());
		for (Engines engine : engines) {
			result.add(engine.toString());
		}
		return result;
	}

}
