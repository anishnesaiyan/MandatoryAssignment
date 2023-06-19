package mandatoryHomeWork.week5.day2;

import org.junit.Test;

public class Day2_IsSubsequence_LC_392 {
	/*
	 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

		A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
		(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
		Example 1:		
		Input: s = "abc", t = "ahbgdc"
		Output: true
		
		Example 2:		
		Input: s = "axc", t = "ahbgdc"
		Output: false
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	@Test // Edge Case
	public void example2() {
		String s = "axc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	@Test // negative
	public void example3() {
		String s = "axc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

	/*
	 * Pseudo code here 
	 * 1. Keep one pointer at string 1 and another pointer at String 2
	 * 2. check s1=s2, move both pointers
	 		else move s2
	 * 3. 
	 * 
	 * This takes 2 ms
	 */
	 public static boolean isSubsequence(String s, String t) {
	        int i=0, j=0;
	
	        if(s.length()>t.length()) return false;
	        while(j<t.length()) {
	        	if(i<s.length() && s.charAt(i)==t.charAt(j)) {
	        		i++;
	        		j++;
	        	}
	        	else {
	        		j++;
	        	}
	        	
	        }
		 return i==s.length();
	    }
	 
	 //Another method after converting into an array runs in 0ms
	 public static boolean isSubsequence2(String s, String t) {
	        int i=0, j=0;
	        char a[]= s.toCharArray();
	        char b[]= t.toCharArray();		
	        if(s.length()>t.length()) return false;
	        
	        while(j<b.length) {
	        	if(i<a.length && a[i]==b[j]) {
	        		i++;
	        		j++;
	        	}
	        	else {
	        		j++;
	        	}
	        	
	        }
		 return i==a.length;
	    }
}
