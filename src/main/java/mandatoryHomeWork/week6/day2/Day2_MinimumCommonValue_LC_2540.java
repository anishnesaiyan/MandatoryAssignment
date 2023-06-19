package mandatoryHomeWork.week6.day2;

import org.junit.Test;

public class Day2_MinimumCommonValue_LC_2540 {

	/*
	 * https://leetcode.com/problems/minimum-common-value/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int nums1[] = {1,3,4}, nums2[] = {2,4};
		
		System.out.println(getCommon(nums1,nums2));
	}

	@Test // Edge Case
	public void example2() {
		int nums1[] = {1,2,3,6}, nums2[] = {2,3,4,5};
		
		System.out.println(getCommon(nums1,nums2));
	}

	@Test // negative
	public void example3() {
		
		int nums1[] = {1,3,6}, nums2[] = {2,4,7,8};
		
		System.out.println(getCommon(nums1,nums2));
	}

	/*
	 * Pseudo code here 
	 * 1. Keep two pointers at start of array
	 * 2. loop till both the array reaches length
	 * 3. if nums1=nums2 -- directly return the number
	 * 	  if nums1<nums2 -- increment nums1
	 * 	  if nums1>nums2 -- increment nums2
	 * 
	 */
	public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;   
        //Loop until either 1 of the array reaches the length --Important
		while(i<nums1.length && j<nums2.length) {
			
			if(nums1[i]==nums2[j]) return nums1[i];
			
			else if(nums1[i]<nums2[j]) {
				if(i<nums1.length)i++;
			}
			else if(nums1[i]>nums2[j]) {
				if(j<nums2.length)j++;
			}
			System.out.println(i);
			System.out.println(j);
		}
	
	return -1;
    }
}
