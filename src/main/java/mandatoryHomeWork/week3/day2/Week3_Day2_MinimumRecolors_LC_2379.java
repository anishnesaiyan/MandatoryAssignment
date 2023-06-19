package mandatoryHomeWork.week3.day2;

import org.junit.Test;

public class Week3_Day2_MinimumRecolors_LC_2379 {
	/*
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. 
	 * The characters 'W' and 'B' denote the colors white and black, respectively.
		You are also given an integer k, which is the desired number of consecutive black blocks.		
		In one operation, you can recolor a white block such that it becomes a black block.		
		Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	
		Example 1:
		Input: blocks = "WBBWWBBWBW", k = 7
		Output: 3
		Explanation:
		One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
		so that blocks = "BBBBBBBWBW". 
		It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
		Therefore, we return 3.
		
		Example 2		
		Input: blocks = "WBWBBBW", k = 2
		Output: 0
		Explanation:
		No changes need to be made, since 2 consecutive black blocks already exist.
		Therefore, we return 0.

	 * 
	 */
	@Test // + ive
	public void example1() {
		String blocks = "WBBWWBBWBW"; 
		int k = 7;
		System.out.println(minimumRecolors(blocks, k));
	}

	@Test // Edge Case
	public void example2() {
		String blocks = "WBWBBBW"; 
		int k = 2;
		System.out.println(minimumRecolors(blocks, k));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Convert the string into a char array
	 * 2. Take the first k values and iterate to it to see the number of W blocks and make that as min
	 * 3. Create another loop to traverse using sliding window if the first and last is W then min remains same
	 * 4. first B and last W add 1 to in value
	 * 5. First w and last black the decremnt by 1
	 * 6. If both are black no change in min value
	 * 
	 * 
	 * 
	 */
	private void twoSum_BruteForce() {

	}
//"WBBWWBBWBW"; 
	 public int minimumRecolors(String blocks, int k) {
	        char arr[] = blocks.toCharArray();
	        int i=0;
	        int min =0;
	        // To find the initial min value of k elements
	       while(i<k) {
	    	   if(arr[i]=='W') {
	    		   min++;
	    	   }
	    	i++;   
	       }
	       // Temp variable used for comparing
	    	int count=min;
	    	
	    	// Sliding window for succeeding elements
	    	
	    	for (int left = 1, right =k; right < arr.length; left++, right++) {
			
	    	if(arr[left-1]=='W' && arr[right] =='W') {
	    		//No change in min value
	    	}	    	
	    	else if(arr[left-1]=='B' && arr[right] =='B') {
	    		//No change in min value
	    	}
	    	else if(arr[left-1]=='B' && arr[right] =='W') {count++;}
	    	else if(arr[left-1]=='W' && arr[right] =='B') {count--;}
	    	
	    	if(count<min)
	    		min=count;
	    	
			}
	    	 System.out.println(min);  
	     
		 
		 return min;
	  }
	    
}
