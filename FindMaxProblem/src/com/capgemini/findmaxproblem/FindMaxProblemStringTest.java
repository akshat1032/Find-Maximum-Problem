package com.capgemini.findmaxproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMaxProblemStringTest {

	// Test Case 3.1 Maximum String at position 1
	@Test
	public void testFindMaxStringOne() {
		String expectedValue = "Peach";
		String actualValue = FindMaxProblem.findMaxString("Peach", "Apple", "Banana");
		Assert.assertEquals(expectedValue, actualValue);
	}

}
