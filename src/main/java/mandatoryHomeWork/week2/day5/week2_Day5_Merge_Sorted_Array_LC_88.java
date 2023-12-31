package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

public class week2_Day5_Merge_Sorted_Array_LC_88 {

	/*
	 * Your Question here
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

		Merge nums1 and nums2 into a single array sorted in non-decreasing order.
		
		The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
		
		Example 1:
		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		Output: [1,2,2,3,5,6]
		Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
		The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
		
		Example 2:
		Input: nums1 = [1], m = 1, nums2 = [], n = 0
		Output: [1]
		Explanation: The arrays we are merging are [1] and [].
		The result of the merge is [1].
		
		Example 3:
		Input: nums1 = [0], m = 0, nums2 = [1], n = 1
		Output: [1]
		Explanation: The arrays we are merging are [] and [1].
		The result of the merge is [1].
		Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/
	@Test // + ive
	public void example1() {
//		int[] nums1 = {1}, nums2 = {};
//		int m = 1, n = 0;
		//System.out.println(nums2.length);
		int[] nums1 = {4,5,6,0,0,0}, nums2 = {1,2,3};
		int m = 3, n = 3;
		merge(nums1,m,nums2,n);
 
		
	}

	@Test // Edge Case
	public void example2() {
		int[] nums1 = {1}, nums2 = {};
		int m = 1, n = 0;
		merge(nums1,m,nums2,n);
	}

	@Test // negative
	public void example3() {
		
		int[] nums1 = {0}, nums2 = {1};
		int m = 1, n = 1;
		merge(nums1,m,nums2,n);
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
	 * 1. Take two pointer at both array index
	 * 2.  if i<=j moce i++
	 * 3.	if i>j swap i and j and move i++
	 * 		
	 */
public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
	
	if(m==1 && n==0) {
		System.out.println(Arrays.toString(nums1));
	}
	else if(m==1 && n==1) {
		
		nums1[0]=nums2[0];
		System.out.println(Arrays.toString(nums1));
		
	}
	else {
		//int[] nums1 = {4,5,6,0,0,0}, nums2 = {1,2,3};
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0) {
        	
        	if(nums2[j]>=nums1[i]) {
        		nums1[k]=nums2[j];
        		j--;
        		k--;
        		
        	}
        	else if(nums2[j]<nums1[i]) {
        		nums1[k]=nums1[i];
        		i--;
        		k--;
        	}
        	
        	
        }		
        System.out.println(Arrays.toString(nums1));
    }}
}

