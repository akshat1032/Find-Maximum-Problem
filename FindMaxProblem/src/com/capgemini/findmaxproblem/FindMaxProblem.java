package com.capgemini.findmaxproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FindMaxProblem<E extends Comparable<E>> {

	private static final Scanner INPUT_USER = new Scanner(System.in);
	private ArrayList<E> listOfValues;

	public FindMaxProblem(E... es) {
		this.listOfValues = new ArrayList<E>(Arrays.asList(es));
	}

	// Generic Method to find max for more than three parameters
	public static <E extends Comparable<E>> E findMax(ArrayList<E> values) {
		Collections.sort(values);
		return values.get(values.size() - 1);
	}

	// Method to internally call static find max method
	public E testMaximum() {
		return findMax(this.listOfValues);
	}

	public static void main(String[] args) {
		// Welcome message added
		System.out.println("Welcome to find maximum problem\n");

		// Taking input for integers from user
		System.out.println("Enter four numbers to check for maximum");
		int first = INPUT_USER.nextInt();
		int second = INPUT_USER.nextInt();
		int third = INPUT_USER.nextInt();
		int four = INPUT_USER.nextInt();
		INPUT_USER.nextLine();

		// Taking input for floating numbers from user
		System.out.println("Enter three floating point numbers to check for maximum");
		double firstFloat = INPUT_USER.nextDouble();
		double secondFloat = INPUT_USER.nextDouble();
		double thirdFloat = INPUT_USER.nextDouble();
		INPUT_USER.nextLine();

		// Taking input for strings from user
		System.out.println("Enter five strings to check for maximum");
		String firstString = INPUT_USER.nextLine();
		String secondString = INPUT_USER.nextLine();
		String thirdString = INPUT_USER.nextLine();
		String fourthString = INPUT_USER.nextLine();
		String fifthString = INPUT_USER.nextLine();

		// Calling find max function for different types
		Integer maximumInt = new FindMaxProblem<Integer>(first, second, third, four).testMaximum();
		Double maximumDouble = new FindMaxProblem<Double>(firstFloat, secondFloat, thirdFloat).testMaximum();
		String maximumString = new FindMaxProblem<String>(firstString, secondString, thirdString, fourthString,
				fifthString).testMaximum();

		// Printing the maximum to console
		System.out.println("The largest integer out of the input  is : " + maximumInt);
		System.out.println("The largest floating number out of the input is : " + maximumDouble);
		System.out.println("The largest String out of the input is : " + maximumString);
	}

}
