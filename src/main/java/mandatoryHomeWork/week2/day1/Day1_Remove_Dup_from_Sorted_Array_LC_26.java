package mandatoryHomeWork.week2.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Remove_Dup_from_Sorted_Array_LC_26 {

	/*
	 * Your Question here
	 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

			Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
			
			Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
			Return k.
			Custom Judge:
			
			The judge will test your solution with the following code:
			
			int[] nums = [...]; // Input array
			int[] expectedNums = [...]; // The expected answer with correct length
			
			int k = removeDuplicates(nums); // Calls your implementation
			
			assert k == expectedNums.length;
			for (int i = 0; i < k; i++) {
			    assert nums[i] == expectedNums[i];
			}
			If all assertions pass, then your solution will be accepted.
			
			 
			
			Example 1:
			
			Input: nums = [1,1,2]
			Output: 2, nums = [1,2,_]
			Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
			It does not matter what you leave beyond the returned k (hence they are underscores).
			Example 2:
			
			Input: nums = [0,0,1,1,1,2,2,3,3,4]
			Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
			Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
			It does not matter what you leave beyond the returned k (hence they are underscores).
	 */
	@Test // + ive
	public void example1() {

		
		//int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int nums[] = {1,1,2};

		System.out.println(twoSum_TwoPointer(nums));
		
	}

	@Test // Edge Case
	public void example2() {
		int nums[] = {0,1,1};
		System.out.println(twoSum_TwoPointer(nums));
	}

	@Test // negative
	public void example3() {
		int nums[] = {0,0};
		System.out.println(twoSum_TwoPointer(nums));
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
	 * 1. Copy the nums to a copy a nums array
	 * 2. Loop the copy nums array verify i and i+1
	 * 		if both are equal move to next iteration
	 * `	else copy the i'th element of CopyNums array to nums array first index and increment the nums index
	 * 3. loop till length -1
	 * 4. after loop add the last element alone and return the K+1 as output
	
	 */
	private int twoSum_TwoPointer(int nums[]) {
		 
		int copyNums[]= nums;
		int k=0;
		for (int i = 0; i < copyNums.length-1; i++) {
			
			if(copyNums[i]!=copyNums[i+1]) {
					nums[k]=copyNums[i];
					k++;}
		}
		nums[k]=nums[nums.length-1];
		//System.out.println(k+1);
		System.out.println(Arrays.toString(nums));
		 return k+1;
	} 
	}
	

