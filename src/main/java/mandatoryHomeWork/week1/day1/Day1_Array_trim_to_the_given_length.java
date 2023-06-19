package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Array_trim_to_the_given_length {
	/*
	 * Your Question here
	 * Implement below methods using array
	 * 
	 * 	trim to the given length
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[]= {1,2,3,4,5,6};
		//Trim the values 1 from from end
		trimtoGivenLength(a,2);
	}

	@Test // Edge Case
	public void example2() {
		int a[]= {1,1};
		//Trim the values 1 from from end
		trimtoGivenLength(a,2);
	}

	@Test // negative
	public void example3() {
		int a[]= {1};
		trimtoGivenLength(a,2);
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Iterate through the array
	 * 2. Create a new array of size based on the input
	 * 3. Iterate till the new array gets fill
	 * 4. Once it got filled exit the loop
	 * 
	 * 
	 */
	private void trimtoGivenLength(int[] array, int trim) {
		
		
		if(array.length>=trim) {
			int newArray[]= new int[array.length-trim];
		for (int i = 0; i < array.length; i++) {
			
			if(i<newArray.length) {
				
				newArray[i]= array[i];
			}
			else break;
				
			
		}
		System.out.println("Before Trim"+ Arrays.toString(array));
		System.out.println("After Trim"+ Arrays.toString(newArray));
		}
		else {
			System.out.println("Invalid input");
		}
		
	}
		

	
}
