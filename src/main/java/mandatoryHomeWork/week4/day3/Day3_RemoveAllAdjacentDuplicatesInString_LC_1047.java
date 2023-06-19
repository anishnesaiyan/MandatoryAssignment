package mandatoryHomeWork.week4.day3;

import java.util.Stack;

import org.junit.Test;

public class Day3_RemoveAllAdjacentDuplicatesInString_LC_1047 {
	/*
	 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
		We repeatedly make duplicate removals on s until we no longer can.
		Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

		Example 1:
		Input: s = "abbaca"
		Output: "ca"
		Explanation: 
		For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
		
		Example 2:		
		Input: s = "azxxzy"
		Output: "ay"
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		String s="abbaca";
		System.out.println(removeDuplicates(s));
	}

	@Test // Edge Case
	public void example2() {
		String s="azxxzy";
		System.out.println(removeDuplicates(s));
	}

	@Test // negative
	public void example3() {
		String s="";
		System.out.println(removeDuplicates(s));
	}

	/*
	 * Pseudo code here using stack
	 * 1. Add each character to a stack 
	 * 2. If the previous value is equal to new value then do pop
	 * 3. If the size is zero do a push
	 * 4. Else do a push
	 * 
	 */
public String removeDuplicates(String s) {
	//abbaca
	Stack<Character> s1= new Stack<Character>();
	int i=0;	
	//Pointer is used to mark the insert position
	int pointer=-1;
	while(i<s.length())
	{	
		if(s1.size()==0) {
			s1.push(s.charAt(i));
			pointer++;
		}
		else if(s.charAt(i)==s1.get(pointer))
		{
			s1.pop();
			pointer--;
		}
		else {
			s1.push(s.charAt(i));
			pointer++;
		}
		i++;
	}	
	return s1.toString().replaceAll("[^a-z]", "");

    }

}
