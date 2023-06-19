package mandatoryHomeWork.week1.day4;

import java.util.Arrays;

import org.junit.Test;

public class Day4_Missing_Number_LC_268 {

	/*
	 * Your Question here
	 * Given an array nums containing n distinct numbers in the range [0, n], 
	 * return the only number in the range that is missing from the array.
		
	 * Example 1:
		Input: nums = [3,0,1]
		Output: 2
		Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
		2 is the missing number in the range since it does not appear in nums.
		
		Example 2:		
		Input: nums = [0,1]
		Output: 2
		Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 
		2 is the missing number in the range since it does not appear in nums.
		
		Example 3:		
		Input: nums = [9,6,4,2,3,5,7,0,1]
		Output: 8
		Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 
		8 is the missing number in the range since it does not appear in nums.
			 */
	@Test // + ive
	public void example1() {

		int a[] = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(a));
		
	}

	@Test // Edge Case
	public void example2() {
		int a[] = {0 };
		System.out.println(missingNumber(a));
	}

	@Test // negative
	public void example3() {
		int a[] = {};
		System.out.println(missingNumber(a));
	}

	/*
	 * Pseudo code here 1. Brute force
	 * 1. Get the input array and sum it up - Current Sum
	 * 2. Run through another starting from 1 till the nums.length value and sum the i values - new sum
	 * 3. Return the value of newsum-Currentsum - Result
	 * 
	 * ,s
	 * 
	 */
	 public int missingNumber(int[] nums) {
		 int currentSum=0, newSum=0;
		for(int i=0;i<nums.length;i++) {
			
			currentSum =currentSum+nums[i];
		}
		for(int i=1;i<=nums.length;i++) {
					
					newSum =newSum+i;
				}
	        
		 return newSum-currentSum;
	    }
}

