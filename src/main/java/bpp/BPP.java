package bpp;

import java.nio.file.Path;
import java.nio.file.Paths;

import bpp.executables.AnalysisWorkflow;

public class BPP {

	public static void main(String[] args) {
		System.out.println("BPEL Portability Profile Analyzer");

		validateAndSetArgs(args);

		Path root = Paths.get(args[0]);

		AnalysisWorkflow workflow = new AnalysisWorkflow(root);

		workflow.start();
	}

	private static void validateAndSetArgs(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Wrong arguments!");
			System.out.println("Arguments must be:");
			System.out.println("[1]: Path to BPEL file or directory");
			System.exit(1);
		}
	}

}
