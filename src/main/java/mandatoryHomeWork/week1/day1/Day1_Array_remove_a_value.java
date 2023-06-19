package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Array_remove_a_value {
	/*
	 * Your Question here 
	 * Implement below methods using array 
	 * remove a value
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[] = { 1, 12, 10, 10,10,13 };
		remove_value(a, 10);

	}

	@Test // Edge Case
	public void example2() {
		int a[] = { 1 ,1,1};
		remove_value(a, 1);
	}

	@Test // negative
	public void example3() {
		int a[] = { 1,2,3,4 };
		remove_value(a, 10);
	}

	/*
	 * Pseduo code here 1. Brute force 
	 * 1. Iterate through the array and create a new array of size based on the counter value 
	 * 2. If array matches the digit ignore
	 * 3. Else add the value to the new array
	 * 
	 * 
	 */

	private void remove_value(int[] array, int digit) {
		int i,j;
		int count = contains(array, digit);
		if (count>0 && array.length > 0) {
			int newArray[] = new int[array.length - count];
			for (i = 0,j=0; i < array.length; i++) {
				if (array[i] == digit)
					continue;
				else {
					newArray[j]=array[i];
					j++;}
			}
			System.out.println("After removal array will --> "+ Arrays.toString(newArray));
		}
		
	}

	private int contains(int[] array, int digit) {

		int count = 0;
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == digit) {
					count++;
				}
			}
		}
		return count;
	}

}
