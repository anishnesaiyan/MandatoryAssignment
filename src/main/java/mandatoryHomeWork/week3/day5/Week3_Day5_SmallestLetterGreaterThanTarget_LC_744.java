package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class Week3_Day5_SmallestLetterGreaterThanTarget_LC_744 {
/*
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

		Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
		
		Example 1:
		Input: letters = ["c","f","j"], target = "a"
		Output: "c"
		Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
		
		Example 2:
		Input: letters = ["c","f","j"], target = "c"
		Output: "f"
		Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
		
		Example 3:
		Input: letters = ["x","x","y","y"], target = "z"
		Output: "x"
		Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
		 * 
		 */
	@Test // + ive
	public void example1() {
		
		char[] letters= {'c','f','j','k'};
		char target ='i';
		System.out.println(nextGreatestLetter(letters,target));

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Loop through each char 
	 * 2. if its greater return i
	 * 3. If not return 0
	 */
public char nextGreatestLetter(char[] letters, char target) {
	
	for (int i = 0; i < letters.length; i++) {
		if(letters[i]>target)
			return letters[i];
		}	
	
		return letters[0];
    }
	
}
