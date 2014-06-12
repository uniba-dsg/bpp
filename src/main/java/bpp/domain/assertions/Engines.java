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

	public static Engines getEngineFromString(String engine) {
		switch (engine) {
		case "ode136":
			return ODE136;
		case "ode136-in-memory":
			return ODE136_IN_MEMORY;
		case "ode":
			return ODE;
		case "ode-in-memory":
			return ODE_IN_MEMORY;
		case "openesb":
			return OPENESB;
		case "openesb23":
			return OPENESB23;
		case "openesb231":
			return OPENESB231;
		case "petalsesb":
			return PETALS;
		case "petalsesb41":
			return PETALSESB41;
		case "bpelg":
			return BPELG53;
		case "bpelg-in-memory":
			return BPELG_IN_MEMORY;
		case "active-bpel":
			return ACTIVEBPEL;
		case "wso2_v2_1_2":
			return WSO2_212;
		case "wso2_v3_0_0":
			return WSO2_300;
		case "wso2_v3_1_0":
			return WSO2_310;
		case "orchestra":
			return ORCHESTRA;
		default:
			throw new IllegalArgumentException();
		}
	}

}
