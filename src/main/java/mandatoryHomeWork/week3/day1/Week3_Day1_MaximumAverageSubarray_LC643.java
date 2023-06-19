package mandatoryHomeWork.week3.day1;

import org.junit.Test;

public class Week3_Day1_MaximumAverageSubarray_LC643 {
	/*
	 * Your Question here
	 * You are given an integer array nums consisting of n elements, and an integer k.

		Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
		Any answer with a calculation error less than 10-5 will be accepted.

		Example 1:
		Input: nums = [1,12,-5,-6,50,3], k = 4
		Output: 12.75000
		Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
		
		Example 2:
		Input: nums = [5], k = 1
		Output: 5.00000
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		int nums[] = {1,12,-5,-6,50,3}, k = 4;
		System.out.println(findMaxAverage(nums,k));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Sliding window
	 * 1.Loop through first k value and find the max avg
	 * 2. Loop through the next set of K elements
	 * 3. Decrement the  first and add the add nxt element 
	 * 4. Chck the sum>max then replace max avg
	 * 5. Finally return the maxavg by dividing it with K
	 * 
	 */
public double findMaxAverage(int[] nums, int k) {
    double maxavg=0;
    double avg=0;
	for (int i = 0; i < k; i++) {
		maxavg+=nums[i];
	}
	
	avg=maxavg;
	for (int i = 1; i <= nums.length-k; i++) {
		avg=avg-nums[i-1]+nums[i+k-1];
		if(avg>maxavg)
			maxavg=avg;
	}
	return maxavg/k;
    }

	
}
