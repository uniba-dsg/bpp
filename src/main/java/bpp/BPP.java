package bpp;

import java.nio.file.Path;
import java.nio.file.Paths;

import bpp.executables.AnalysisWorkflow;

public class BPP {

    private static boolean isStrict = false;

	public static void main(String[] args) {
		System.out.println("BPEL Portability Profile Analyzer");

		validateAndSetArgs(args);

		Path root = Paths.get(args[0]);

		AnalysisWorkflow workflow = new AnalysisWorkflow(root,isStrict);

		workflow.start();
	}

	private static void validateAndSetArgs(String[] args) {
        if (args.length == 2 && "-s".equals(args[1])){
            System.out.println("Using strict parsing -- Only BPEL files with namespace http://docs.oasis-open.org/wsbpel/2.0/process/executable will be read");
            isStrict = true;
        } else if (args.length != 1) {
			System.out.println("Error: Wrong arguments!");
			System.out.println("Arguments must be:");
			System.out.println("[1]: Path to BPEL file or directory");
			System.exit(1);
		}
	}

}
