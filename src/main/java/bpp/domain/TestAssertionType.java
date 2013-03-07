package bpp.domain;

public enum TestAssertionType {
	ACTIVITY_CHILD, ACTIVITY, ACTIVITY_GRANDCHILD, CONSTRUCT;

	@Override
	public String toString() {
		if (this == ACTIVITY) {
			return "Activity";
		} else if (this == ACTIVITY_CHILD || this == ACTIVITY_GRANDCHILD) {
			return "Part of an activity";
		} else {
			return "Element";
		}
	}
}
