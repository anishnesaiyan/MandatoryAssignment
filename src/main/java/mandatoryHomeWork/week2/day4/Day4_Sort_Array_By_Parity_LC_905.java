package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

public class Day4_Sort_Array_By_Parity_LC_905 {

	/*
	 * Your Question here
	 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

		Return any array that satisfies this condition.

		Example 1:		
		Input: nums = [3,1,2,4]
		Output: [2,4,3,1]
		Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
		
		Example 2:		
		Input: nums = [0]
		Output: [0]
*/
	@Test // + ive
	public void example1() {
		int[] nums= {3,1,2,4};
		System.out.println(Arrays.toString(SortArrayByParity(nums)));
 
		
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {
	
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
	 * 1. Take two pointer  one at start and one at end
	 * 2. There will be four conditions
	 * 		if i=j= even -- move i alone
	 * 		if i=j=odd  -- move j alone
	 * 		if i= odd and j = even = >swap both and incremen both i and j
	 * 		if i= even and j= odd ==> increment both
	 * 3. Return the array
	 */
	private int[] SortArrayByParity(int nums[]) {
		int j=nums.length-1;
		int i=0;
		while(i<j) {
			
			if(nums[i]%2 ==0 && nums[j]%2==0 ) i++;
			
			else if(nums[i]%2 !=0 && nums[j]%2!=0) j--;
			
			else if(nums[i]%2 !=0 && nums[j]%2==0) {
				int temp = nums[i];
				nums[i]= nums[j];
				nums[j]= temp;
				i++;
				j--;}
			
			else if(nums[i]%2 ==0 && nums[j]%2!=0) {
				i++;
				j--;
				}	
		}
		return nums;
		
}
	}
	

