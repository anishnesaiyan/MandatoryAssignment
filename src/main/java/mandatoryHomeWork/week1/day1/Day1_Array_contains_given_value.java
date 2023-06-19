package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Array_contains_given_value {
	/*
	 * Your Question here
	 * Implement below methods using array
	 * contains a given value
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[]= {1,2,3, 3};
		contains(a,3);
	}

	@Test // Edge Case
	public void example2() {
		int a[]= {3,3,3,3,-1};
		contains(a,3);
	}

	@Test // negative
	public void example3() {
		int a[]= {};
		contains(a,3);
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 
	 * 1. Iterate through the array
	 * 2. If array matches the input digit make the flag true and increment the counter
	 * 3. Else check the next value
	 * 4. At end print the matching count
	 * 
	 */
	private boolean contains(int[] array, int digit) {
		
		boolean flag=false; int count=0;
		if(array.length>0) {
		for (int i = 0; i< array.length; i++) {
		if(array[i]==digit) {
		flag= true;
		count ++;}
		}
		}
		if(flag) 
			System.out.println("The give array contains the digit:"+digit+ "--> " + count +" times");
		else
			System.err.println("Match not found or the given array is an empty array");
		
		return flag;
	}
	
}
