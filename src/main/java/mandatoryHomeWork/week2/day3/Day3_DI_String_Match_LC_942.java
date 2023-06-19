package mandatoryHomeWork.week2.day3;

import java.util.Arrays;

import org.junit.Test;

public class Day3_DI_String_Match_LC_942 {

	/*
	 * Your Question here
	 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

		s[i] == 'I' if perm[i] < perm[i + 1], and
		s[i] == 'D' if perm[i] > perm[i + 1].
		Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
		
		Example 1:		
		Input: s = "IDID"
		Output: [0,4,1,3,2]
		
		Example 2:		
		Input: s = "III"
		Output: [0,1,2,3]
		
		Example 3:		
		Input: s = "DDI"
		Output: [3,2,0,1]
*/
	@Test // + ive
	public void example1() {

		String s="DDI";
		//DIStringMatch(s);	
		System.out.println(Arrays.toString(DIStringMatch(s))); 
		
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
	 * 1. Declare Start as 0 and end as String length
	 * 2. Create a int array of size +1 than string length
	 * 3. Iterate through the string by each character
	 * 		if char is I then store the start value in array and increment start value by 1
	 * 		if char is D then store the end value in array and decrement end value by 1
	 * 4. After the loop
	 * 			if String last value is I store the start value in array last index
	 * 			else store the end value in array last index
	
	 */
	private int[] DIStringMatch(String inputString) {
		int start=0;
		int end=inputString.length();
		int [] output= new int[inputString.length()+1];
		
		for (int i = 0; i < inputString.length(); i++) {
			
			if(inputString.charAt(i)=='I') {
				output[i]=start;
				start++;
			}
			else if(inputString.charAt(i)=='D') {
				output[i]=end;
				end--;
			}
		}
		if(inputString.charAt(inputString.length()-1)=='I')
		output[inputString.length()]=start;
		
		else output[inputString.length()]=end;	
		//System.out.println(Arrays.toString(output)); 
		return output;
}
	}
	

