package mandatoryHomeWork.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Week3_Day2_Minimum_Absolute_Difference_LC_2380 {
	/*
	 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

		Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
		
		a, b are from arr
		a < b
		b - a equals to the minimum absolute difference of any two elements in arr
 

		Example 1:		
		Input: arr = [4,2,1,3]
		Output: [[1,2],[2,3],[3,4]]
		Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
		
		Example 2:		
		Input: arr = [1,3,6,10,15]
		Output: [[1,3]]
		
		Example 3:	
		Input: arr = [3,8,-10,23,19,-4,-14,27]
		Output: [[-14,-10],[19,23],[23,27]]
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int arr[] = {3,8,-10,23,19,-4,-14,27};
		minimumAbsDifference(arr);
		
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Sort the array
	 * 2. Loop through find the differenc of (i+1 and i
	 * 3. If diff<min , min == diff
	 * 4. Clear the list if it has other values
	 * 3. Add the i and I+1 value to list using Arrays.asList
	 * 4. if diff == min  
	 * 		add along with exisitng
	 * 
	 * 
	 */

public List<List<Integer>> minimumAbsDifference(int[] arr) {
	List<List<Integer>> res = new ArrayList();
    //sort elements
    Arrays.sort(arr);
    //init our min difference value
    int min = Integer.MAX_VALUE;
    //start looping over array to find real min element. Each time we found smaller difference
    //we reset resulting list and start building it from scratch. If we found pair with the same
    //difference as min - add it to the resulting list
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length - 1; i++) {
    	
        int diff = arr[i + 1] - arr[i];
        if (diff < min) {
            min = diff;
            res.clear();
            res.add(Arrays.asList(arr[i], arr[i + 1]));
        } else if (diff == min) {
            res.add(Arrays.asList(arr[i], arr[i + 1]));
        }
    }
    System.out.println(res);
    return res;
    
    }


}
