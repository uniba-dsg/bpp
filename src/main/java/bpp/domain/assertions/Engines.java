package bpp.domain.assertions;

public enum Engines {
	ODE136, OPENESB231, PETALSESB41, BPELG53, ACTIVEBPEL, WSO2_310, ORCHESTRA;

	@Override
	public String toString() {
		switch (this) {
		case ODE136:
			return "ode136";
		case OPENESB231:
			return "openesb231";
		case PETALSESB41:
			return "petalsesb41";
		case BPELG53:
			return "bpelg";
		case ACTIVEBPEL:
			return "active-bpel";
		case WSO2_310:
			return "wso2_v3_1_0";
		case ORCHESTRA:
			return "orchestra";
		default:
			throw new IllegalStateException();
		}
	}

}
