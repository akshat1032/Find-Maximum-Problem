package com.capgemini.findmaxproblem;

import java.util.Scanner;

public class FindMaxProblem {

	private static final Scanner INPUT_USER = new Scanner(System.in);
	private static Integer maximumInt;

	// Method to find maximum integer
	public static int findMaxInteger(Integer first, Integer second, Integer third) {
		Integer max = first;
		if (second.compareTo(max) > 0) {
			max = second;
		}
		if (third.compareTo(max) > 0) {
			max = third;
		}
		return max;
	}

	public static void main(String[] args) {
		// Welcome message added
		System.out.println("Welcome to find maximum problem\n");

		// Taking input for integers from user
		System.out.println("Enter three numbers to check for maximum");
		int first = INPUT_USER.nextInt();
		int second = INPUT_USER.nextInt();
		int third = INPUT_USER.nextInt();

		// Calling finding maximum integer function
		maximumInt = findMaxInteger(first, second, third);
		System.out.println("The largest integer out of " + first + ", " + second + ", " + third + " is : " + maximumInt);
	}
}
