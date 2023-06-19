package mandatoryHomeWork.week5.day2;

import java.util.ArrayList;

import org.junit.Test;

public class Day2_GoalParserInterpretation_LC_1678 {
	/*
	 * https://leetcode.com/problems/goal-parser-interpretation/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String command = "G()(al)";
		System.out.println(interpret(command));
		
	}

	@Test // Edge Case
	public void example2() {
		String command = "G()()()()(al)";
		System.out.println(interpret(command));

	}

	@Test // negative
	public void example3() {
		String command = "(al)G(al)()()G";
		System.out.println(interpret(command));

	}

	/*
	 * Pseudo code here (using string got 6ms but using String builder got only 0ms)
	 * 1. Convert the string into char array
	 * 2. Loop through each char
	 * 		- if i'th character and i+1'th character are ( and ) then append the string with o
	 * 		- if i'th character is ( or ) skip
	 * 		-- else add all the character into string builder
	 * 	3. return as String
	 * 
	 * 
	 * 
	 */
public static String interpret(String command) {
        char a[]= command.toCharArray();
        
        StringBuilder res=new StringBuilder();
        
        for (int i = 0; i < a.length; i++) {
			if(a[i]=='(' && a[i+1]==')') {
				res=res.append('o');
			}
			else if(a[i]=='('||a[i]==')') {
				continue;
			}
			else {
				res=res.append(a[i]);
			}
		}
	
	return res.toString();
    }
}
