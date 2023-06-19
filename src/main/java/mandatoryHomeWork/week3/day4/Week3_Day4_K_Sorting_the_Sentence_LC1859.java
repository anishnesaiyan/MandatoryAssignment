package mandatoryHomeWork.week3.day4;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Week3_Day4_K_Sorting_the_Sentence_LC1859 {

	/*
	 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

		A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
		
		For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
		Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

		Example 1:
		
		Input: s = "is2 sentence4 This1 a3"
		Output: "This is a sentence"
		Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
		Example 2:
		
		Input: s = "Myself2 Me1 I4 and3"
		Output: "Me Myself and I"
		Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		String s= "is2 sentence4 This1 a3";
		sortSentence(s);

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Split the string based on spaces and store it in an array
	 * 2. Store in a hashmap with keep pair - last character as key and other as value
	 * 3. Retrive using a for loop and combine as a string
	 * 
	 */
	

public void sortSentence(String s) {
	
	String arr[]=s.split(" ");
	System.out.println(Arrays.toString(arr));
	
	HashMap<Integer, String> hm= new HashMap<>();
	//To store the array values in hash map
	for (int i = 0; i < arr.length; i++) {
		
		//To get the number from the string
		char number = arr[i].charAt(arr[i].length()-1);
		
		//to convert char to int
		int a = number - '0';
		
		//Adding into hash map , using substring function ignored the last integer value
		hm.put(a, arr[i].substring(0, arr[i].length()-1));
	}
	System.out.println(hm);
	
	String output="";
	//To retreive the values
	for (int i = 1; i <= hm.size(); i++) {
	
	output=output+" "+ hm.get(i);
	
	}
	
	System.out.println(output.trim());
	//return "";
        
    }

}
