package bpp.domain;

public enum PortabilityLevel {
	PORTABLE, WIDELY_PORTABLE, PARTIALLY_PORTABLE, LIMITED_PORTABILITY, NONPORTABLE;

	@Override
	public String toString() {
		if (this == PORTABLE) {
			return "portable";
		} else if (this == WIDELY_PORTABLE) {
			return "widely portable";
		} else if (this == PARTIALLY_PORTABLE) {
			return "partially portable";
		} else if (this == LIMITED_PORTABILITY) {
			return "limited portability";
		} else if (this == NONPORTABLE) {
			return "nonportable";
		} else {
			return "";
		}
	}

}
