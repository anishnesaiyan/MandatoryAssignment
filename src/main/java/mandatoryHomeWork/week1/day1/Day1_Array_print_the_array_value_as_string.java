package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Array_print_the_array_value_as_string {
	/*
	 * Your Question here
	 * Implement below methods using array
		print the array value as string
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[] = { 1, 2, 3 };
		printArrayValueasString(a);

	}

	@Test // Edge Case
	public void example2() {
		int a[] = { 1, 2, -1 };
		printArrayValueasString(a);
	}

	@Test // negative
	public void example3() {

		int a[] = {};
		printArrayValueasString(a);
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Using to String function directly print the array value as String
	 * 
	 * 
	 */

	private void printArrayValueasString(int[] array) {
		System.out.println("Array Values are" + Arrays.toString(array));
	}

}
