package com.capgemini.findmaxproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxProblemTest {

	// Test Case 1.1 Maximum number at position 1
	@Test
	public void testFindMaxIntegerOne() {
		Integer expectedValue = 9;
		Integer actualValue = FindMaxProblem.findMaxInteger(9, 6, 8);
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 1.2 Maximum number at position 2
	@Test
	public void testFindMaxIntegerTwo() {
		Integer expectedValue = 9;
		Integer actualValue = FindMaxProblem.findMaxInteger(6, 9, 8);
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 1.3 Maximum number at position 3
	@Test
	public void testFindMaxIntegerThree() {
		Integer expectedValue = 9;
		Integer actualValue = FindMaxProblem.findMaxInteger(7, 6, 9);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
