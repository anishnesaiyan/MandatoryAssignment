package mandatoryHomeWork.week4.day2;

import java.util.Stack;

import org.junit.Test;

public class Day2_BackspaceStringCompare_844 {
	/*
	 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

		Note that after backspacing an empty text, the text will continue empty.

		Example 1:
		Input: s = "ab#c", t = "ad#c"
		Output: true
		Explanation: Both s and t become "ac".
		
		Example 2:
		Input: s = "ab##", t = "c#d#"
		Output: true
		Explanation: Both s and t become ""
		
		Example 3:
		Input: s = "a#c", t = "b"
		Output: false
		Explanation: s becomes "c" while t becomes "b".
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s = "ab#c", t = "ad#c";
		
		System.out.println(backspaceCompare(s,t));
	}

	@Test // Edge Case
	public void example2() {
		String s = "ab##", t = "c#d#";
		System.out.println(backspaceCompare(s,t));
	}

	@Test // negative
	public void example3() {
		String s ="a##c", t="#a#c";
		System.out.println(backspaceCompare(s,t));
	}

	/*
	 * Pseudo code here Using stack
	 * 1. Take each string and iterate through each character
	 * 2. if Char is # do pop operation
	 * 3. else do push operation of character
	 * 
	 */
public boolean backspaceCompare(String s, String t) {
        
	
	String a=stackOutput(s);
	String b= stackOutput(t);	
	if(a.equals(b)) 
		return true;
	else 
		return false;
    }
public static String stackOutput(String s) {
	Stack<Character> s1= new Stack<Character>();
	int i=0;	
	while(i<s.length())
	{
		if(s.charAt(i)=='#') {
			//If stack is empty don't do anything
			if(s1.size()>0) {
			s1.pop();}
			}
		else {
			s1.push(s.charAt(i));}
		i++;
	}	
	return s1.toString();
}
}
