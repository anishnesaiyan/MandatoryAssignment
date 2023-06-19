package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

import org.junit.Test;

public class Week3_Day3_Sort_the_People_LC_2418 {
	/*
	 * You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

		For each index i, names[i] and heights[i] denote the name and height of the ith person.
		
		Return names sorted in descending order by the people's heights.

		Example 1:		
		Input: names = ["Mary","John","Emma"], heights = [180,165,170]
		Output: ["Mary","Emma","John"]
		Explanation: Mary is the tallest, followed by Emma and John.
		
		Example 2:		
		Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
		Output: ["Bob","Alice","Bob"]
		Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String[] names = {"Alice","Bob","Bob"};
		int[] height= {155,185,150};
		System.out.println(sortPeople(names,height));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here
	 * 1. Sort the heights in descending order
	 * 2. Use bubble sort technique
	 * 3. During swapping swap the names also
	 * 
	 * Selection sort for descending
	 * 1.Take the pivot
	 * 2. Find the highest in the array
	 * 3. Swap with the highest
	 * 4. Continue Step 2&3 for the next pivot
	 */
	

	 public String[] sortPeople(String[] names, int[] heights) {
	        
		 for (int i = 0; i < heights.length-1; i++) {
			int maxloc=i;
			for (int j = i+1; j < heights.length; j++) {
				if(heights[maxloc] < heights[j])
				{
					maxloc=j;
				}
			}
			int temp =heights[maxloc];
			heights[maxloc]=heights[i];
			heights[i]=temp;
			
			//also swapping names array as well
			String tempr =names[maxloc];
			names[maxloc]=names[i];
			names[i]=tempr;
		  	
		}
		 System.out.println(Arrays.toString(heights));
		 System.out.println(Arrays.toString(names));
		 return names;
	    }
	 
	 //Another method using tree map
	 public String[] sortPeople2(String[] names, int[] heights) {
	      
		    String[] result = new String[names.length];
		      
		    TreeMap < Integer, String > map = new TreeMap < > (Collections.reverseOrder());

		    for (int i = 0; i < names.length; i++) {
		      map.put(heights[i], names[i]);           // Heights in descending order
		    }

		    int i = 0;
		    for (int h: map.keySet()) {
		      result[i++] = map.get(h);               // Iterate TreeMap
		    }

		    return result;
		  }

}
