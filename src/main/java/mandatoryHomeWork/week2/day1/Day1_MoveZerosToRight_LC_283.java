package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_MoveZerosToRight_LC_283 {

	/*
	 * Your Question here
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * 
			Note that you must do this in-place without making a copy of the array.
			Example 1:
			
			Input: nums = [0,1,0,3,12]
			Output: [1,3,12,0,0]
			Example 2:
			
			Input: nums = [0]
			Output: [0]
	 * 
	 */
	@Test // + ive
	public void example1() {

		
		int nums[] = {0,1,0,3,12};
		//int nums[] = {0,1,0};

		twoSum_TwoPointer(nums);
	}

	@Test // Edge Case
	public void example2() {
		int nums[] = {0,1};
		
		twoSum_TwoPointer(nums);
	}

	@Test // negative
	public void example3() {
		int nums[] = {0};
		twoSum_TwoPointer(nums);
	}

	/*
	 * Pseduo code here 1. Brute force
	 * 
	 * 
	 * 
	 */
	private void twoSum_BruteForce() {

	}
	/*
	 * Pseudo code here 1. Brute force
	 * 1. Take two pointer
	 * 2. P1 loop through all ways p2 will move only during swap
	 * 3. if p1 is not zero then swap p1 with p2
	 * 		else move p1 to next
	
	 */
	private void twoSum_TwoPointer(int nums[]) {
		 int p1;
		 int p2=0;
		for ( p1=0; p1< nums.length; p1++) {
			if(nums[p1]!=0) {
				int temp=nums[p1];
				nums[p1]=nums[p2];
				nums[p2]=temp;
				p2++;
			}}
		System.out.println(Arrays.toString(nums));
	} 
	}
	

