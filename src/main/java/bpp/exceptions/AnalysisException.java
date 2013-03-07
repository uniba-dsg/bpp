package bpp.exceptions;

public class AnalysisException extends RuntimeException{

	private static final long serialVersionUID = 0L;

	public AnalysisException() {
		super();
	}

	public AnalysisException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public AnalysisException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public AnalysisException(String arg0) {
		super(arg0);
	}

	public AnalysisException(Throwable arg0) {
		super(arg0);
	}

}
