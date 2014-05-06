package bpp.domain.assertions;

public enum Engines {
	ODE136, ODE136_IN_MEMORY, ODE, ODE_IN_MEMORY, OPENESB, OPENESB23, OPENESB231, PETALSESB41, BPELG53, ACTIVEBPEL, WSO2_310, ORCHESTRA;

	@Override
	public String toString() {
		switch (this) {
		case ODE136:
			return "ode136";
		case ODE136_IN_MEMORY:
			return "ode136-in-memory";
		case ODE:
			return "ode";
		case ODE_IN_MEMORY:
			return "ode-in-memory";
		case OPENESB:
			return "openesb";
		case OPENESB23:
			return "openesb23";
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
