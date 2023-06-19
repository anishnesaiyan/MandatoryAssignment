package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

import org.junit.Test;

public class Day4_ReversePrefixofWord_LC_2000 {

	/*
	 * Your Question here
	 * Given a 0-indexed string word and a character ch, 
	 * reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
	 * If the character ch does not exist in word, do nothing.

		For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
		Return the resulting string.

		Example 1:		
		Input: word = "abcdefd", ch = "d"
		Output: "dcbaefd"
		Explanation: The first occurrence of "d" is at index 3. 
		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
		
		Example 2:		
		Input: word = "xyxzxe", ch = "z"
		Output: "zxyxxe"
		Explanation: The first and only occurrence of "z" is at index 3.
		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
		
		Example 3:		
		Input: word = "abcd", ch = "z"
		Output: "abcd"
		Explanation: "z" does not exist in word.
		You should not do any reverse operation, the resulting string is "abcd".
*/
	@Test // + ive
	public void example1() {

		String S="abcdefd";
		char c= 'd';
		//System.out.println(ReversePrefixofWord(S,c));
		System.out.println(ReversePrefixofWord2(S,c));
		
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
	 * 1. Get the string and find the first occurence of the given character
	 * 2. Pick the string in that range and reverse the part alone and store in string
	 * 3. Then concatenate the reversed string with remaining indexed string value
	 */
	private String ReversePrefixofWord(String word, char ch) {
		int i=0;
		String reverse ="";
		boolean foundOccurrence=false;
		if(word.length()<2) return word;
		
		while(i<word.length()) {
			
			if(!foundOccurrence)
			{
			reverse= word.charAt(i)+reverse;
			if(word.charAt(i)==ch) foundOccurrence=true;
			}
			else {
				reverse=reverse+word.charAt(i);
			}
			i++;
		}
		return foundOccurrence?reverse:word;
		
		}
	//Another approach using tow pointer;
		/*
		 * 1. Convert the string into an array ( As array use less space than string creating new space each time in SCP)  
		 * Find the index of first occurrence using a loop
		 * 2. If found the occurrence Create another loop for two pointer
		 * 		1. Left at 0 index and  right at found index
		 * 		2. Swap one by one
		 * 		3. Return the array
		 * 
		 */
	private String ReversePrefixofWord2(String word, char ch) {
		char[] array=word.toCharArray();
		int i=0;
		boolean found=false;
		while(i<array.length) {
			if(array[i]==ch)
				{found=true;
				break;}
			i++;
		}
		if(array.length<2 || found==false) return word;
		//i value considered as found index
		for (int j = 0; j < i; j++) {
			char temp= array[j];
			array[j]=array[i];
			array[i] = temp;
			i--;
		}
		// To return the value as sTring from a char array
		return String.valueOf(array);
		}
}
	

