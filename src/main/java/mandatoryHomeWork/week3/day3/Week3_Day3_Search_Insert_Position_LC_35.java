package mandatoryHomeWork.week3.day3;

import org.junit.Test;

public class Week3_Day3_Search_Insert_Position_LC_35 {
	/*
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

		You must write an algorithm with O(log n) runtime complexity.
				
		Example 1:		
		Input: nums = [1,3,5,6], target = 5
		Output: 2
		
		Example 2:		
		Input: nums = [1,3,5,6], target = 2
		Output: 1
		
		Example 3:		
		Input: nums = [1,3,5,6], target = 7
		Output: 4
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		
		int nums[] = {2,3,5,6};
		int target = 1;
		System.out.println(searchInsert(nums,target));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here usinf divide and conquer method
	 * 1. Assign left=0, right=lengh-1, right +left/2
	 * 2. if mid= target == return mid
	 * 3. If mid>target move end to mid-1
	 * 4. If mid<target move start to mid-1
	 * 5. Return start
	 * 
	 * 
	 * 
	 */
	public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            
            if (nums[mid] == target) return mid;
            
            else if (nums[mid] > target) end = mid-1;
            
            else start = mid+1;
        }

        return start;
    }

	

}
