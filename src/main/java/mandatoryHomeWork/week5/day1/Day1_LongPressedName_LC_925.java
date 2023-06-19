package mandatoryHomeWork.week5.day1;

import java.util.HashMap;
import java.util.Iterator;

import org.junit.Test;

public class Day1_LongPressedName_LC_925 {
	/*
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

		You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

		Example 1:
		Input: name = "alex", typed = "aaleex"
		Output: true
		Explanation: 'a' and 'e' in 'alex' were long pressed.
		
		Example 2:		
		Input: name = "saeed", typed = "ssaaedd"
		Output: false
		Explanation: 'e' must have been pressed twice, but it was not in the typed output.
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String name = "alex", typed = "aaleex";				
		System.out.println(isLongPressedName(name,typed));
	}

	@Test // Edge Case
	public void example2() {
		String name = "aaalex", typed = "aaaaaaaleexxx";				
		System.out.println(isLongPressedName(name,typed));
	}

	@Test // negative
	public void example3() {
		String name = "alex", typed = "aley";				
		System.out.println(isLongPressedName(name,typed));
	}

	/*
	 * Pseudo code here
	 * 1. Take two pointer i and j (i for name string and j for typed string)
	 * 2. Lopp till typed string length
	 * 3. If char of i and j matches move both i and j to next point
	 * 4. If char of j equals char of i-1, move j alone
	 * 5. Else return false directly
	 * 
	 * 
	 */
	public static boolean isLongPressedName(String name, String typed) {
		int n= name.length();
		int m= typed.length();
		int i=0,j=0;
		//If two strings are equal
		if(name.equals(typed)) return true;
		
		//If typed length is less than name length
		if(m<n) return false;
		
		while(j<typed.length()) {
			
			if(i<name.length() && name.charAt(i)==typed.charAt(j)) {
				i++;
				j++;
			}
			else if (j!=0 && name.charAt(i-1)==typed.charAt(j)) {
			j++;
			}
			else {
				return false;
			}
		}
		return i==name.length();
    
}}
