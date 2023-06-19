package mandatoryHomeWork.week3.day3;

import java.util.Arrays;

import org.junit.Test;

public class Week3_Day3_Minimum_Difference_LC_1984 {
	/*
	 * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. 
	 * You are also given an integer k.
		Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
		Return the minimum possible difference.

		Example 1:		
		Input: nums = [90], k = 1
		Output: 0
		Explanation: There is one way to pick score(s) of one student:
		- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
		The minimum possible difference is 0.
		
		Example 2:		
		Input: nums = [9,4,1,7], k = 2
		Output: 2
		Explanation: There are six ways to pick score(s) of two students:
		- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
		- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
		- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
		- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
		- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
		- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
		The minimum possible difference is 2.
	 * 
	 */
	@Test // + ive
	public void example1() {

		int[] nums= {9,4,1,7};
		int k=2;
		System.out.println(minimumDifference(nums,k));
	}

	@Test // Edge Case
	public void example2() {

		int[] nums= {87063,61094,44530,21297,95857,93551,9918};
		int k=6;
		System.out.println(minimumDifference(nums,k));
		//op: 74560
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
		1. We can use bubble sort
	 * 	2. Find the min difference for the given k values using sliding window
	 * 	3. return the min value
	 * 
	 * Bubble sort
	 * 1. Comapre the adjacent values
	 * 2. If left>right swap
	 * 3. Continue step 2 --> 0 to n
	 * 4. Continue 2 and 3 for 1 to n-i
	 * 
	 */
public int minimumDifference(int[] nums, int k) {
        
	if(k==1) return 0;
	// For sorting the array using bubble sort
	for (int i = 0; i < nums.length; i++) {
		boolean swap =false;
		for (int j = 0; j < nums.length-i-1; j++) {
			if(nums[j]>nums[j+1]) {
				int temp = nums[j];
				nums[j]=nums[j+1];
				nums[j+1]= temp;
				swap=true;
			}
		}
		if(!swap) break;		
	}
	System.out.println(Arrays.toString(nums));
	// To find the min difference using sliding window

	int output=Integer.MAX_VALUE;
	for (int left = 0, right=k-1; right<nums.length; left++, right++) {
		int min=nums[right]-nums[left];
		if(min<output)
			output=min;
			
	}
	System.out.println(output);
	
	return output;
    }

//Another method using Arrays.sort and sliding window
public int minimumDifference2(int[] nums, int k) {
    if (k == 1) return 0;

    Arrays.sort(nums);
	
    int i = 0, j = k - 1, 
    min = Integer.MAX_VALUE;

    while (j < nums.length) {
        min = Math.min(min, nums[j++] - nums[i++]);
    }

    return min;
}

}
