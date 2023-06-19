package mandatoryHomeWork.week2.day2;

import java.util.Arrays;

import org.junit.Test;

public class Day2_Merge_Strings_Alternately_LC_1768 {

	/*
	 * Your Question here
	 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
			Example 1:
			Input: word1 = "abc", word2 = "pqr"
			Output: "apbqcr"
			Explanation: The merged string will be merged as so:
			word1:  a   b   c
			word2:    p   q   r
			merged: a p b q c r
			
			Example 2:
			Input: word1 = "ab", word2 = "pqrs"
			Output: "apbqrs"
			Explanation: Notice that as word2 is longer, "rs" is appended to the end.
			word1:  a   b 
			word2:    p   q   r   s
			merged: a p b q   r   s
			
			Example 3:
			Input: word1 = "abcd", word2 = "pq"
			Output: "apbqcd"
			Explanation: Notice that as word1 is longer, "cd" is appended to the end.
			word1:  a   b   c   d
			word2:    p   q 
			merged: a p b q c   d
	 * 
	 */
	@Test // + ive
	public void example1() {
		//String word1 = "abc", word2 = "pqr";
		//String word1 = "ab", word2 = "pqrs";
		String	word1 = "abcd", word2 = "pq";
		System.out.println(mergeString(word1, word2));
	}

	@Test // Edge Case
	public void example2() {
//		String word1 = "abc", word2 = "pqr";
//		twoSum_TwoPointer(word1, word2);
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
	 * 1. Take Two string 
	 * 2. Loop till the sum of both the string length
	 * 3. if i< word 1 length - add to new string
	 * 4. if i< word 2 length - add to new string
	 * 5. return the final string
	
	 */
	private String mergeString(String word1, String word2) {
        String output="";
		for (int i = 0; i < word1.length()+ word2.length(); i++) {
			if(i<word1.length()) {
				output=output+word1.charAt(i);
			}
			if(i<word2.length()) {
				output=output+word2.charAt(i);
			}
		}
		return output;
    
	} 
	/// Same approach using String builder
	
	private String mergeString2(String word1, String word2) {
		 StringBuilder output = new StringBuilder();
		for (int i = 0; i < word1.length()+ word2.length(); i++) {
			if(i<word1.length()) {
				output.append(word1.charAt(i));
			}
			if(i<word2.length()) {
				output.append(word2.charAt(i));
			}
		}
		return output.toString();
    
	} 
	}
	

