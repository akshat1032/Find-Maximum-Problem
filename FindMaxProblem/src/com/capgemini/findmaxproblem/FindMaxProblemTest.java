package com.capgemini.findmaxproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxProblemTest {

	// Test Case 1.1 Maximum number at position 1	
	@Test
	public void testFindMaxInteger() {
		Integer expectedValue = 9;
		Integer actualValue = FindMaxProblem.findMaxInteger(9, 6, 8);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
