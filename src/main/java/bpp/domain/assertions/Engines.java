package bpp.domain.assertions;

public enum Engines {
	ODE136, ODE136_IN_MEMORY, ODE, ODE_IN_MEMORY, OPENESB, OPENESB23, OPENESB231, PETALS, PETALSESB41, BPELG53, BPELG_IN_MEMORY, ACTIVEBPEL, WSO2_212, WSO2_300, WSO2_310, ORCHESTRA;

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
		case PETALS:
			return "petalsesb";
		case PETALSESB41:
			return "petalsesb41";
		case BPELG53:
			return "bpelg";
		case BPELG_IN_MEMORY:
			return "bpelg-in-memory";
		case ACTIVEBPEL:
			return "active-bpel";
		case WSO2_212:
			return "wso2_v2_1_2";
		case WSO2_300:
			return "wso2_v3_0_0";
		case WSO2_310:
			return "wso2_v3_1_0";
		case ORCHESTRA:
			return "orchestra";
		default:
			throw new IllegalStateException();
		}
	}

}
