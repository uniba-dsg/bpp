package bpp.domain;

public class Warning {

	private TestAssertion assertion;

	private int line;

	private int parentLine;

	private int grandparentLine;

	public Warning(TestAssertion assertion, int line, int parentLine,
			int grandparentLine) {
		this.assertion = assertion;
		this.line = line;
		this.parentLine = parentLine;
		this.grandparentLine = grandparentLine;
	}

	public int getGrandparentLine() {
		return grandparentLine;
	}

	public int getParentLine() {
		return parentLine;
	}

	public TestAssertion getAssertion() {
		return assertion;
	}

	public int getLine() {
		return line;
	}

}
