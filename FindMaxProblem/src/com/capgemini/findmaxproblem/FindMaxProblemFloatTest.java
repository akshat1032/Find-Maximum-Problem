package com.capgemini.findmaxproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxProblemFloatTest {

	// Test Case 2.1 Maximum number at position 1
	@Test
	public void testFindMaxIntegerOne() {
		Double expectedValue = 9.9;
		Double actualValue = FindMaxProblem.findMaxFloat(9.9, 9.6, 9.8);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
