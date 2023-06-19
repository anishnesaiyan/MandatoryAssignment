package mandatoryHomeWork.week3.day1;

import org.junit.Test;

public class Week3_Day1_GoodSubstring_LC1876 {
	/*
	 * Your Question here
	 * A string is good if there are no repeated characters.

		Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
		
		Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
		
		A substring is a contiguous sequence of characters in a string.
		
		 
		
		Example 1:		
		Input: s = "xyzzaz"
		Output: 1
		Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
		The only good substring of length 3 is "xyz".
		
		Example 2:		
		Input: s = "aababcabc"
		Output: 4
		Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
		The good substrings are "abc", "bca", "cab", and "abc".
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s="aababcabc";
		countGoodSubstrings_1(s);

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseduo code here 1. Using sliding window
	 * 1. Covert the string into an array
	 * 2. Loop through the array with three three elements
	 * 3. Comapre 1=2, 2=3, 3=1, if not increment count
	 * 4. Finally print count
	 * 
	 * 
	 */
	private void countGoodSubstrings_1(String s) {
		int length=3;
		int count=0;
		char [] a=s.toCharArray();
		for (int i = 0,j=length-1; j <= a.length-1; i++,j++) {
			
			if(a[i]!=a[i+1] && a[i+1]!=a[i+2] && a[i+2]!=a[i] )
				count++;
			
		}
		System.out.println(count);
		
	}

	
	//Using two pointer
	public int countGoodSubstrings(String s) {
	      int count =0;
	      int left=0; ;
	      for(int right = 2; right<=s.length()-1;right++,left++)
	      {
	    	 boolean val= returnUniqueString( s.substring(left, right+1));
	    	 if(val)count++;
	      }
	      return count;  
	    }
	    
	private boolean returnUniqueString(String s) {
			if (s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) && s.charAt(0) != s.charAt(2) )
				return true;
			else
				return false;

		}
}
