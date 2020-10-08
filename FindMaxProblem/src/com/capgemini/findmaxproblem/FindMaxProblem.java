package com.capgemini.findmaxproblem;

import java.util.Scanner;

public class FindMaxProblem {

	private static final Scanner INPUT_USER = new Scanner(System.in);
	private static Integer maximumInt;
	private static Double maximumFloat;
	private static String maximumString;

	// Method to find highest integer
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

	// Method to find highest floating number
	public static double findMaxFloat(Double first, Double second, Double third) {
		Double max = first;
		if (second.compareTo(max) > 0) {
			max = second;
		}
		if (third.compareTo(max) > 0) {
			max = third;
		}
		return max;
	}

	// Method to find highest string
	public static String findMaxString(String first, String second, String third) {
		String max = first;
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

		// Taking input for floating numbers from user
		System.out.println("Enter three floating point numbers to check for maximum");
		double firstFloat = INPUT_USER.nextDouble();
		double secondFloat = INPUT_USER.nextDouble();
		double thirdFloat = INPUT_USER.nextDouble();

		// Taking input for strings from user
		System.out.println("Enter three strings to check for maximum");
		String firstString = INPUT_USER.nextLine();
		String secondString = INPUT_USER.nextLine();
		String thirdString = INPUT_USER.nextLine();

		// Calling finding maximum integer function
		maximumInt = findMaxInteger(first, second, third);
		System.out
				.println("The largest integer out of " + first + ", " + second + ", " + third + " is : " + maximumInt);

		// Calling finding maximum floating number function
		maximumFloat = findMaxFloat(firstFloat, secondFloat, thirdFloat);
		System.out.println("The largest floating number out of " + firstFloat + ", " + secondFloat + ", " + thirdFloat
				+ " is : " + maximumFloat);
		
		// Calling finding maximum String function
				maximumString = findMaxString(firstString, secondString, thirdString);
				System.out.println("The largest String out of " + firstString + ", " + secondString + ", " + thirdString
						+ " is : " + maximumString);
	}
}
