package com.capgemini.findmaxproblem;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxProblemGenericTest {

	// Test Case 1.1 Maximum number at position 1
	@Test
	public void testFindMaxIntegerOne() {
		Integer expectedValue = 9;
		Integer actualValue = new FindMaxProblem<Integer>(9, 6, 8).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 1.2 Maximum number at position 2
	@Test
	public void testFindMaxIntegerTwo() {
		Integer expectedValue = 9;
		Integer actualValue = new FindMaxProblem<Integer>(6, 9, 8).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 1.3 Maximum number at position 3
	@Test
	public void testFindMaxIntegerThree() {
		Integer expectedValue = 9;
		Integer actualValue = new FindMaxProblem<Integer>(7, 6, 9).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 2.1 Maximum number at position 1
	@Test
	public void testFindMaxFloatOne() {
		Double expectedValue = 9.9;
		Double actualValue = new FindMaxProblem<Double>(9.9, 9.6, 9.8).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 2.2 Maximum number at position 2
	@Test
	public void testFindMaxFloatTwo() {
		Double expectedValue = 9.9;
		Double actualValue = new FindMaxProblem<Double>(9.6, 9.9, 9.8).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 2.3 Maximum number at position 3
	@Test
	public void testFindMaxFloatThree() {
		Double expectedValue = 9.9;
		Double actualValue = new FindMaxProblem<Double>(9.7, 9.6, 9.9).testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 3.1 Maximum String at position 1
	@Test
	public void testFindMaxStringOne() {
		String expectedValue = "Peach";
		String actualValue = new FindMaxProblem<String>("Peach", "Apple", "Banana").testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 3.2 Maximum String at position 2
	@Test
	public void testFindMaxStringTwo() {
		String expectedValue = "Peach";
		String actualValue = new FindMaxProblem<String>("Apple", "Peach", "Banana").testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 3.3 Maximum String at position 3
	@Test
	public void testFindMaxStringThree() {
		String expectedValue = "Peach";
		String actualValue = new FindMaxProblem<String>("Apple", "Banana", "Peach").testMaximum();
		Assert.assertEquals(expectedValue, actualValue);
	}
}
