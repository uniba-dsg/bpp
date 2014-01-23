package bpp.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import bpp.domain.assertions.TestAssertion;
import bpp.domain.assertions.TestAssertions;

public class LatexSerializer {

	private final String FILE_NAME = "assertions.tex";

	private final String TABLE_NEWLINE = "\\\\\\hline";

	public static void main(String[] args) throws FileNotFoundException {
		new LatexSerializer().serializeAssertions();
	}

	private void serializeAssertions() throws FileNotFoundException {
		List<TestAssertion> assertions = new TestAssertions().createAll();
		try (PrintWriter writer = new PrintWriter(FILE_NAME)) {

			int floatsProcessed = 0;
			for (TestAssertion assertion : assertions) {
				serializeAssertion(assertion, writer);
				floatsProcessed++;
				if (floatsProcessed % 15 == 0) {
					writer.println("\\newpage");
					writer.println();
				}
			}
		}

	}

	private void serializeAssertion(TestAssertion assertion, PrintWriter writer) {
		writeHeader(assertion, writer);
		writeBody(assertion, writer);
		writeFooter(assertion, writer);
	}

	private void writeHeader(TestAssertion assertion, PrintWriter writer) {
		writer.println("\\begin{table}[htbp]");
		writer.println("\\center");
		writer.println("\\caption{Test Assertion " + assertion.getId() + "}");
		writer.println("\\begin{tabular}{p{90pt}|p{370pt}}");
	}

	private void writeBody(TestAssertion assertion, PrintWriter writer) {
		writer.println("ID & " + assertion.getId() + TABLE_NEWLINE);
		writer.println("Description &" + assertion.getDescription()
				+ TABLE_NEWLINE);
		writer.println("Target & " + assertion.getTarget() + TABLE_NEWLINE);
		writer.println("Degree & " + assertion.getDegree() + TABLE_NEWLINE);
		writer.println("Level & "
				+ assertion.getLevel().toString().replace("_", "\\_")
				+ TABLE_NEWLINE);
		writer.println("Warning Message &" + assertion.getDiagnosticMessage());
	}

	private void writeFooter(TestAssertion assertion, PrintWriter writer) {
		writer.println("\\end{tabular}");
		writer.println("\\label{tab:" + assertion.getId() + "}");
		writer.println("\\end{table}");
		writer.println();
	}
}
