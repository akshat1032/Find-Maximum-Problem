package com.capgemini.findmaxproblem;

import java.util.Scanner;

public class FindMaxProblem<E extends Comparable<E>> {

	private static final Scanner INPUT_USER = new Scanner(System.in);
	private E first, second, third;

	public FindMaxProblem(E first, E second, E third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	// Generic Method to find max
	public static <E extends Comparable<E>> E findMax(E first, E second, E third) {
		E max = first;
		if ((second.compareTo(max)) > 0) {
			max = second;
		}
		if (third.compareTo(max) > 0) {
			max = third;
		}
		return max;
	}

	// Method to internally call static find max method
	public E testMaximum() {
		return findMax(this.first, this.second, this.third);
	}

	public static void main(String[] args) {
		// Welcome message added
		System.out.println("Welcome to find maximum problem\n");

		// Taking input for integers from user
		System.out.println("Enter three numbers to check for maximum");
		int first = INPUT_USER.nextInt();
		int second = INPUT_USER.nextInt();
		int third = INPUT_USER.nextInt();
		INPUT_USER.nextLine();

		// Taking input for floating numbers from user
		System.out.println("Enter three floating point numbers to check for maximum");
		double firstFloat = INPUT_USER.nextDouble();
		double secondFloat = INPUT_USER.nextDouble();
		double thirdFloat = INPUT_USER.nextDouble();
		INPUT_USER.nextLine();

		// Taking input for strings from user
		System.out.println("Enter three strings to check for maximum");
		String firstString = INPUT_USER.nextLine();
		String secondString = INPUT_USER.nextLine();
		String thirdString = INPUT_USER.nextLine();

		// Calling find max function for different types
		Integer maximumInt = new FindMaxProblem<Integer>(first, second, third).testMaximum();
		Double maximumDouble = new FindMaxProblem<Double>(firstFloat, secondFloat, thirdFloat).testMaximum();
		String maximumString = new FindMaxProblem<String>(firstString, secondString, thirdString).testMaximum();

		// Printing the maximum to console
		System.out
				.println("The largest integer out of " + first + ", " + second + ", " + third + " is : " + maximumInt);
		System.out.println("The largest floating number out of " + firstFloat + ", " + secondFloat + ", " + thirdFloat
				+ " is : " + maximumDouble);
		System.out.println("The largest String out of " + firstString + ", " + secondString + ", " + thirdString
				+ " is : " + maximumString);
	}

}
