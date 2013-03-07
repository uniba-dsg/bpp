package bpp.exceptions;

public class ReportGenerationException extends RuntimeException {

	private static final long serialVersionUID = 0L;

	public ReportGenerationException() {
		super();
	}

	public ReportGenerationException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public ReportGenerationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ReportGenerationException(String arg0) {
		super(arg0);
	}

	public ReportGenerationException(Throwable arg0) {
		super(arg0);
	}

}
