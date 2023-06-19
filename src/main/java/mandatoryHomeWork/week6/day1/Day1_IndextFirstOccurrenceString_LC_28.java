package mandatoryHomeWork.week6.day1;

import org.junit.Test;

public class Day1_IndextFirstOccurrenceString_LC_28 {
	/*
	 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(strStr(haystack,needle));
		

	}

	@Test // Edge Case
	public void example2() {
		String haystack = "leetcode", needle = "leeto";
		System.out.println(strStr(haystack,needle));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here
	 * 1. Get the length of the needle String
	 * 2. Using substring function(i,j) ------------(i =0, j= length of needle)
	 * 3. Get the substring and compare it with target
	 * 		if matches return the i value
	 * 		else increment i and j value
	 * 
	 */
public static int strStr(String haystack, String needle) {

    for ( int i = 0,j=needle.length(); j <= haystack.length(); i++,j++) {
		if(haystack.substring(i, j).equals(needle)) {
			return i;
		}
    	
	}	
	
    return -1;
    }
}
