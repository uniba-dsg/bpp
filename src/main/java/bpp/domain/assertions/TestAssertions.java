package bpp.domain.assertions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestAssertions {

	public List<TestAssertion> createAll() {
		List<TestAssertion> result = new LinkedList<>();
		result.addAll(new BasicActivityAssertions()
				.createBasicActivityAssertions());
		result.addAll(new ScopeAssertions().createScopeAssertions());
		result.addAll(new StructuredActivityAssertions()
				.createStructuredActivityAssertions());
		result.addAll(new ExtensionAssertions().createExtensionAssertions());
		result.addAll(new FaultAssertions().createFaultTestAssertions());
		return result;
	}

	public List<TestAssertion[]> createAllAsArray() {
		List<TestAssertion[]> result = new LinkedList<>();
		for (TestAssertion assertion : createAll()) {
			TestAssertion[] array = { assertion };
			result.add(array);
		}
		return result;
	}
	
	public List<TestAssertion> createAllSorted(){
		List<TestAssertion> result = createAll();
		
		Collections.sort(result);
		
		return result;
	}

}
