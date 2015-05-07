package bpp.util;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import bpp.domain.assertions.TestAssertion;
import bpp.domain.assertions.TestAssertions;

public class LatexSerializer {

	private final String fileName;

	private final String TABLE_NEWLINE = "\\\\";

	private final String ROW_COLOR = "\\myrowcolour";

	private final boolean useRowColor;

	private final String fontSize = "tiny";

	private PrintWriter writer;

	private int floatsProcessed;

	public static void main(String[] args) throws FileNotFoundException {
		new LatexSerializer(true, args[0]).serializeAssertions(true);
	}

	LatexSerializer(boolean useColor, String fileName) {
		this.useRowColor = useColor;
		this.fileName = fileName;
	}

	public void serializeAssertions(boolean useLongTable)
			throws FileNotFoundException {
		System.out.println("Starting LaTeX serialization to " + fileName);

		try {
			writer = new PrintWriter(fileName);

			if (useLongTable) {
				serializeAssertionsToLongTable();
			} else {
				serializeAssertionsToMultipleTables();
			}

		} finally {
			if (writer != null) {
				writer.close();
			}
		}

		System.out.println("Serialization successful");
	}

	private void serializeAssertionsToMultipleTables()
			throws FileNotFoundException {

		floatsProcessed = 0;

		for (TestAssertion assertion : new TestAssertions().createAll()) {
			writeMultiTableAssertion(assertion);
			checkForTooManyFloats();
		}

	}

	private void serializeAssertionsToLongTable() throws FileNotFoundException {

		writeLongTableHeader();

		writeLongTableBody();

		writeLongTableFooter();
	}

	private void writeLongTableHeader() {
		println("\\begin{center}");
		println("\\begin{" + fontSize + "}");
		println("\\begin{longtable}{p{0.1\\textwidth}|p{0.84\\textwidth}}");
		println("\\caption{Portability Test Assertions}\\\\");
		println("\\textbf{Property} & \\textbf{Test Assertion}");
		println("\\vspace{2pt}\\\\");
		println("\\toprule");
		println("\\endfirsthead");
		println("\\multicolumn{2}{c}");
		println("{\\tablename\\ \\thetable\\ -- \\emph{Continued from previous page}}\\\\");
		println("\\endhead");
		println("\\multicolumn{2}{r}{\\emph{Continued on next page}}");
		println("\\endfoot");
		println("\\bottomrule");
		println("\\endlastfoot");
	}

	private void writeLongTableBody() {
		List<TestAssertion> assertions = new TestAssertions().createAll();
		for (int i = 0; i < assertions.size(); i++) {
			// body
			writeMultiTableBody(assertions.get(i));

			// print a midrule expect for last assertion
			if (i != assertions.size() - 1) {
				println("\\midrule");
			}
		}
	}

	private void writeLongTableFooter() {
		println("\\end{longtable}");
		println("\\end{" + fontSize + "}");
		println("\\end{center}");
	}

	private void writeMultiTableAssertion(TestAssertion assertion) {
		writeMultiTableHeader(assertion);
		writeMultiTableBody(assertion);
		writeMultitableFooter(assertion);
	}

	private void writeMultiTableHeader(TestAssertion assertion) {
		println("\\begin{table}[htbp]");
		println("\\center");
		println("\\scriptsize");
		println("\\caption{Test Assertion " + assertion.getId() + "}");
		println("\\begin{tabular}{p{0.1\\textwidth}|p{0.84\\textwidth}}");
		println("\\toprule");
	}

	private void writeMultiTableBody(TestAssertion assertion) {
		println("ID & " + assertion.getId() + TABLE_NEWLINE);
		printColor();
		println("Description &" + assertion.getDescription() + TABLE_NEWLINE);
		println("Target & " + assertion.getTarget() + TABLE_NEWLINE);
		printColor();
		println("Degree & " + assertion.getDegree() + TABLE_NEWLINE);
	}

	private void writeMultitableFooter(TestAssertion assertion) {
		println("\\bottomrule");
		println("\\end{tabular}");
		println("\\label{tab:" + assertion.getId() + "}");
		println("\\end{table}");
		println("");
	}

	private void checkForTooManyFloats() {
		floatsProcessed++;
		if (floatsProcessed % 15 == 0) {
			println("\\newpage");
			println("");
		}
	}

	private void printColor() {
		if (useRowColor) {
			println(ROW_COLOR);
		}
	}

	private void println(String line) {
		writer.println(line);
	}
}
