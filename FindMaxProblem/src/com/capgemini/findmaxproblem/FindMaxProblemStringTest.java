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

	// Test Case 3.2 Maximum String at position 2
	@Test
	public void testFindMaxStringTwo() {
		String expectedValue = "Peach";
		String actualValue = FindMaxProblem.findMaxString("Apple", "Peach", "Banana");
		Assert.assertEquals(expectedValue, actualValue);
	}

	// Test Case 3.3 Maximum String at position 3
	@Test
	public void testFindMaxStringThree() {
		String expectedValue = "Peach";
		String actualValue = FindMaxProblem.findMaxString("Apple", "Banana", "Peach");
		Assert.assertEquals(expectedValue, actualValue);
	}
}
