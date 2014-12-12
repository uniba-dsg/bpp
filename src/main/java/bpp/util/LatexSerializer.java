package bpp.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import bpp.domain.assertions.TestAssertion;
import bpp.domain.assertions.TestAssertions;

public class LatexSerializer {

	private final String FILE_NAME = "assertions.tex";

	private final String TABLE_NEWLINE = "\\\\";

	private final String ROW_COLOR = "\\myrowcolour";

	private final boolean useRowColor;

	private PrintWriter writer;

	private int floatsProcessed;

	public static void main(String[] args) throws FileNotFoundException {
		new LatexSerializer(true).serializeAssertions();
	}

	LatexSerializer(boolean useColor) {
		this.useRowColor = useColor;
	}

	private void serializeAssertions() throws FileNotFoundException {
		try {
			writer = new PrintWriter(FILE_NAME);

			floatsProcessed = 0;

			for (TestAssertion assertion : new TestAssertions().createAll()) {

				serializeAssertion(assertion);
				checkForTooManyFloats();
			}
		} finally {
			if (writer != null) {
				writer.close();
			}
		}

	}

	private void serializeAssertion(TestAssertion assertion) {
		writeHeader(assertion);
		writeBody(assertion);
		writeFooter(assertion);
	}

	private void writeHeader(TestAssertion assertion) {
		writer.println("\\begin{table}[htbp]");
		writer.println("\\center");
		writer.println("\\scriptsize");
		writer.println("\\caption{Test Assertion " + assertion.getId() + "}");
		writer.println("\\begin{tabular}{p{0.1\\textwidth}|p{0.84\\textwidth}}");
		writer.println("\\toprule");
	}

	private void writeBody(TestAssertion assertion) {
		writer.println("ID & " + assertion.getId() + TABLE_NEWLINE);
		printColor();
		writer.println("Description &" + assertion.getDescription()
				+ TABLE_NEWLINE);
		writer.println("Target & " + assertion.getTarget() + TABLE_NEWLINE);
		printColor();
		writer.println("Degree & " + assertion.getDegree() + TABLE_NEWLINE);
		writer.println("Level & "
				+ assertion.getLevel().toString().replace("_", "\\_")
				+ TABLE_NEWLINE);
	}

	private void writeFooter(TestAssertion assertion) {
		writer.println("\\bottomrule");
		writer.println("\\end{tabular}");
		writer.println("\\label{tab:" + assertion.getId() + "}");
		writer.println("\\end{table}");
		writer.println();
	}

	private void checkForTooManyFloats() {
		floatsProcessed++;
		if (floatsProcessed % 15 == 0) {
			writer.println("\\newpage");
			writer.println();
		}
	}
	
	private void printColor(){
		if(useRowColor){
			writer.println(ROW_COLOR);
		}
	}
}
