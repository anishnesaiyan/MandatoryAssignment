package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

import org.junit.Test;

public class week2_Day5_Reverse_Words_LC_557 {

	/*
	 * Your Question here
	 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 		Example 1:
		
		Input: s = "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
		Example 2:
		
		Input: s = "God Ding"
		Output: "doG gniD"
*/
	@Test // + ive
	public void example1() {
		String s= "Let's take LeetCode contest";
		//System.out.println(reverseWords(s));
		System.out.println(reverseWords2(s));

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
	 * 1. Split the string using spaces and store in aString array
	 * 2. Loop through the splitted array and reverse each words and store in same array
	 * 3. Now create a loop to save the reversed words from last index to a new string and return the reversed string
	 * 	 */
	 public String reverseWords(String s) {
		 //String s= "Let's take LeetCode contest"; 
		 String[] splitted = s.split(" ");
		 String reverse="";
		 for (int i = splitted.length-1; i >=0; i--) {
			 
			 reverse=reverse(splitted[i])+" "+ reverse;
		}
		 
		 
		 return reverse.trim();
	    }
	 // Reversing the string using two pointer
	 public String reverse(String s) {
		 int j= s.length()-1;
		 char[] aray= s.toCharArray();
		 
		 for(int i=0;i<j; i++) {
			char temp=aray[i];
			aray[i]=aray[j];
			aray[j]= temp;
			j--;
		 }
		 return String.valueOf(aray);
	 }
	 
	 /*Another method using String builder
	  * 1. Assign the string to a string builder
	  * 2. reverse the string and split using spaces and store in a String array
	  * 3. Loop through the array and combine the string from the end
	  * 
	  * */
	 public String reverseWords2(String s) {
		 StringBuilder sb= new StringBuilder(s);
		 String [] arry=sb.reverse().toString().split(" ");
		 System.out.println(Arrays.toString(arry));
		 String reverse ="";
		 for (int i = arry.length-1; i >=0; i--) {
			 
			 reverse=reverse+" "+arry[i];
		}
		 
		 
		 return reverse.trim();
	    }
	 //Another method got from leet code
	 /*1. Split the word and store in a string array
	  * 2. Create a result String bilder
	  * 3. Loop through each word and stroe in string gbuilder
	  * 4. reverse it and store in the result string builder
	  * 5
	  * 
	  * */
	 public String reverseWords3(String s) {
		    String[] words = s.split(" ");
		    StringBuilder result = new StringBuilder();
		    for (String word : words) {
		            StringBuilder temp=new StringBuilder(word);
		            temp.reverse();
		            result.append(temp);
		            result.append(" ");
		        }
		    return result.toString().trim();

		    }
	 
	}
	

