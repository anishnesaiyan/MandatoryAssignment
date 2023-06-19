package mandatoryHomeWork.week3.day5;

import java.util.Arrays;

import org.junit.Test;

public class Week3_Day5_Majority_Element_LC169 {
	/*
	 * Given an array nums of size n, return the majority element.

		The majority element is the element that appears more than ⌊n / 2⌋ times. 
		You may assume that the majority element always exists in the array.

		Example 1:
		Input: nums = [3,2,3]
		Output: 3
		
		Example 2:
		Input: nums = [2,2,1,1,1,2,2]
		Output: 2
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		//System.out.println(majorityElement(nums));
		System.out.println(majorityElement2(nums));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Sort the array 
	 * 2. Create outer loop to start with each set of integer 
	 * 3. Create an inner loop through each set of integer 
	 * 4. if i=j -- add the count 
	 *    if not -- break the loop and assign that value to i 
	 *    so i will start from the next set of values
	 * 
	 * 
	 * 
	 */

	public int majorityElement(int[] nums) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		int value = 0;
		int j = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length;) {
			count = 0;
			for (j = i; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					count++;
				} else {
					break;
				}
			}
			i = j;
			if (count > max) {
				max = count;
				value = nums[i - 1];
			}
		}

		return value;
	}
	
	/*Based on the hint tried the below solution
	 * The majority element is the element that appears more than n / 2 times.
	 *  
	 *  1. Sort the array
	 *  2. return values of length/2 as output
	 * 
	 * 
	 */
	public int majorityElement2(int[] nums) {
		
		
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

}
