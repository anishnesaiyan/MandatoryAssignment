package mandatoryHomeWork.week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class Day3_Maximum_Prod_Two_Elemnt_LC_1464 {

	/*
	 * Your Question here
	 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 * 

		Example 1:
		
		Input: nums = [3,4,5,2]
		Output: 12 
		Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
		Example 2:
		
		Input: nums = [1,5,4,5]
		Output: 16
		Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
		Example 3:
		
		Input: nums = [3,7]
		Output: 12
	 */
	@Test // + ive
	public void example1() {

		
		int nums[] = {10,2,5,2};
		//int nums[] = {8,8,7,4,2,8,1,7,7};


		System.out.println(maxProd1(nums));
	}

	@Test // Edge Case
	public void example2() {
				int nums[] = {1,5,4,5};
				System.out.println(maxProd1(nums));
	}

	@Test // negative
	public void example3() {
		int nums[] = {1,5};

		System.out.println(maxProd2(nums));
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
	 * 1. loop through the array
	 * 2. Declare two variables min and max
	 * 		if num[i]>=max 
	 * 			update the second max as current max value
	 * 			and update the new nums[i] as max
	 * 		if num[i] <max and num[i] > second max
	 * 			secondmax= num[i]
	 * 3. Finally return the product by decrementing one value each
	 * 
	 */
	private int maxProd1(int nums[]) {
		int max=0, secondmax=0;
		if(nums.length>2) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>=max) { 
				secondmax=max;
				max= nums[i];
			}
			if (nums[i] < max && nums[i] > secondmax) {
				secondmax = nums[i];
            }
		}
		return (max-1)*(secondmax-1);

		}
		return (nums[0]-1)*(nums[1]-1);
	} 
	//Another method
	// 1. Sort the array
	//	2. then take the last two elements to print the output
	private int maxProd2(int nums[]) {
		
		if(nums.length>2) {
		for (int i = 0; i<nums.length; i++) {
			for (int j = i+1; j<nums.length; j++)
				if(nums[i]>nums[j]) {
					int temp= nums[i];
					nums[i]= nums[j];
					nums[j]=temp;
			}

		}
		
			System.out.println(Arrays.toString(nums));
		}
		return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
	} 
	
	}
	

