package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Array_add_tothe_specific_index {
	/*
	 * Your Question here
	 * Implement below methods using array
	 * add given value to the specific index
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[] = { 1, 2, 3,6,7,8,9 };
		addToSpecificIndex(a, 10,3);
	}

	@Test // Edge Case
	public void example2() {
		int a[] = { 1 };
		addToSpecificIndex(a, 10, 0);
	}

	@Test // negative
	public void example3() {
		int a[] = { };
		addToSpecificIndex(a, 10, 0);
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Get the input array, digit and index
	 * 2. Create a new array of length +1 than input array
	 * 3. Iterate through the loop
	 * 4. When input matches with index insert the new value
	 * 5. Else insert the input array value
	 * 
	 * 
	 */
	private void addToSpecificIndex(int[] array, int digit, int index) {
		if (array.length > 0 && index >= 0) {
			int newArray[] = new int[array.length + 1];
			for (int i = 0, j = 0; i < array.length + 1; i++) {

				if (index == i)
					newArray[i] = digit;
				else {
					newArray[i] = array[j];
					j++;
				}

			}
			System.out.println("Old array" + Arrays.toString(array));
			System.out.println("New array" + Arrays.toString(newArray));
		} else {
			System.err.println("Invalid input");
		}

	}

}
