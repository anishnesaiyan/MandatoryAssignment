package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

import org.junit.Test;

public class Day2_Remove_Element_LC_27 {

	/*
	 * Your Question here
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

		Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
		
		Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
		Return k.
		Example 1:
		
		Input: nums = [3,2,2,3], val = 3
		Output: 2, nums = [2,2,_,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
		It does not matter what you leave beyond the returned k (hence they are underscores).
		Example 2:
		
		Input: nums = [0,1,2,2,3,0,4,2], val = 2
		Output: 5, nums = [0,1,4,0,3,_,_,_]
		Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
		Note that the five elements can be returned in any order.
		It does not matter what you leave beyond the returned k (hence they are underscores).
	 */
	@Test // + ive
	public void example1() {

		
		int nums[] = {0,1,2,2,3,0,4,2};

		int val=3;

		System.out.println(remove_Element(nums, val));
	}

	@Test // Edge Case
	public void example2() {
		int nums[] = {2};
		int val=3;

		System.out.println(remove_Element(nums, val));
	
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
	 * 1. Take nnums array copy
	 * 2. Loop through eahc value if it matches the given value then ignore
	 * 						else add the value to nums array and increment the nums array to next index
	 * 3. Finally return k value	
	
	 */
	private int remove_Element(int nums[], int val) {
		int copyNums[]= nums;
		int k=0;
		for (int i = 0; i < copyNums.length; i++) {
			
			if(copyNums[i]!=val) {
					nums[k]=copyNums[i];
					k++;}
		}
		//nums[k]=nums[nums.length-1];
		//System.out.println(k);
		System.out.println(Arrays.toString(nums));
		 return k;
	} 
	
	// Two pointer approach
	private int remove_Element2(int nums[], int val) {
	int left = 0, right = nums.length - 1;
    
    while(left<=right){
        if(nums[left]==val){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
        }else{
            left++;
        }
        
    }
    
    return left;
}
	}
	

