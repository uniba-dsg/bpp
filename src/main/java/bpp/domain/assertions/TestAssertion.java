package bpp.domain.assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import bpp.domain.PortabilityLevel;

public class TestAssertion implements Comparable<TestAssertion>{

	private String id;

	private String description;

	private String target;

	private TestAssertion prerequisite;

	private String diagnosticMessage;

	private List<String> containedFileLocations;

	private PortabilityLevel level;

	private List<String> nonContainedFileLocations;

	private int degree;

	private final String DESCRIPTION_OPENING = "A process definition ";

	public final static int NUMBER_OF_ENGINES = 9;

	private TestAssertionType type;

	private boolean testsServiceActivity;

	private String predicate;

	private List<Engines> supportedBy;

	public TestAssertion() {
		containedFileLocations = new LinkedList<>();
		nonContainedFileLocations = new LinkedList<>();
		id = "";
		description = "";
		target = "";
		diagnosticMessage = "";
		level = PortabilityLevel.NONPORTABLE;
		supportedBy = new ArrayList<>();
	}

	/**
	 * Returns a list of engines that do support the feature tested by this
	 * assertion
	 * 
	 * @return the list of engines supporting the feature
	 */
	public List<Engines> getSupportingEngines() {
		return Collections.unmodifiableList(supportedBy);
	}

	/**
	 * Returns a list of engines that do not support the feature tested by this
	 * assertion
	 * 
	 * @return the list of engines not supporting the feature
	 */
	public List<Engines> getNotSupportingEngines() {
		List<Engines> result = new ArrayList<>(Engines.values().length
				- supportedBy.size());

		for (Engines engine : Engines.values()) {
			if (!supportedBy.contains(engine)) {
				result.add(engine);
			}
		}

		return result;
	}

	public void addSupportingEngine(Engines supportingEngine) {
		if (supportingEngine == null) {
			throw new IllegalArgumentException("Input must not be null");
		}
		this.supportedBy.add(supportingEngine);
	}

	public String getPredicate() {
		return predicate;
	}

	public boolean isTestsServiceActivity() {
		return testsServiceActivity;
	}

	public void setTestsServiceActivity(boolean testsServiceActivity) {
		this.testsServiceActivity = testsServiceActivity;
	}

	public TestAssertionType getType() {
		return type;
	}

	public void setType(TestAssertionType type) {
		this.type = type;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
		if (degree >= NUMBER_OF_ENGINES - 1) {
			level = PortabilityLevel.NONPORTABLE;
		} else if (degree >= (NUMBER_OF_ENGINES * 0.5)) {
			level = PortabilityLevel.LIMITED_PORTABILITY;
		} else if (degree >= (NUMBER_OF_ENGINES * 0.2)) {
			level = PortabilityLevel.PARTIALLY_PORTABLE;
		} else if (degree != 0) {
			level = PortabilityLevel.WIDELY_PORTABLE;
		} else {
			level = PortabilityLevel.PORTABLE;
		}
	}

	/**
	 * @return the level
	 */
	public PortabilityLevel getLevel() {
		return level;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target
	 *            the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
		this.predicate = "empty(" + target + ")";
	}

	public List<String> getContainedFileLocation() {
		return containedFileLocations;
	}

	public void addContainedFileLocations(String nonContainedFileLocation) {
		this.containedFileLocations.add(nonContainedFileLocation);
	}

	public List<String> getNonContainedFileLocation() {
		return nonContainedFileLocations;
	}

	/**
	 * @param testFileLocation
	 *            the testFileLocation to set
	 */
	public void addNonContainedFileLocations(String nonContainedFileLocation) {
		this.nonContainedFileLocations.add(nonContainedFileLocation);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		StringBuilder result = new StringBuilder(DESCRIPTION_OPENING);
		String notationalConvention = "may";
		if (PortabilityLevel.LIMITED_PORTABILITY.equals(level)
				|| PortabilityLevel.PARTIALLY_PORTABLE.equals(level)) {
			notationalConvention = "should not";
		} else if (PortabilityLevel.NONPORTABLE.equals(level)) {
			notationalConvention = "must not";
		}
		result.append(notationalConvention);
		result.append(" ");
		result.append(description);

		return result.toString();
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the prerequisite
	 */
	public TestAssertion getPrerequisite() {
		return prerequisite;
	}

	/**
	 * @param prerequisite
	 *            the prerequisite to set
	 */
	public void setPrerequisite(TestAssertion prerequisite) {
		this.prerequisite = prerequisite;
	}

	/**
	 * @return the errorMessage
	 */
	public String getDiagnosticMessage() {
		return diagnosticMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setDiagnosticMessage(String errorMessage) {
		this.diagnosticMessage = errorMessage;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof TestAssertion)) {
			return false;
		} else {
			TestAssertion assertion = (TestAssertion) o;
			if (!containedFileLocations.equals(assertion
					.getContainedFileLocation())) {
				return false;
			}
			if (!description.equals(assertion.getDescription())) {
				return false;
			}
			if (!diagnosticMessage.equals(assertion.getDiagnosticMessage())) {
				return false;
			}
			if (!id.equals(assertion.getId())) {
				return false;
			}
			if (!target.equals(assertion.getTarget())) {
				return false;
			}
			if ((prerequisite != null)
					&& !prerequisite.equals(assertion.getPrerequisite())) {
				return false;
			}
			if (!level.equals(assertion.getLevel())) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + id.hashCode();
		result = 31 * result + description.hashCode();
		result = 31 * result + target.hashCode();
		if (prerequisite != null) {
			result = 31 * result + prerequisite.hashCode();
		}
		result = 31 * result + diagnosticMessage.hashCode();
		result = 31 * result + containedFileLocations.hashCode();
		result = 31 * result + level.hashCode();
		result = 31 * result + nonContainedFileLocations.hashCode();

		return result;
	}

	@Override
	public int compareTo(TestAssertion o) {
		if(o == null || o.getId() == null){
			throw new IllegalArgumentException("Comparing TestAssertion must not be null");
		}
		
		return this.getId().compareToIgnoreCase(o.getId());
	}

}
