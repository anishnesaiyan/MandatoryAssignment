package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Day5_Maximum_69_number_LC_1323 {

	/*
	 * Your Question here You are given a positive integer num consisting only of
	 * digits 6 and 9.
	 * 
	 * Return the maximum number you can get by changing at most one digit (6
	 * becomes 9, and 9 becomes 6).
	 * 
	 * Example 1: Input: num = 9669 Output: 9969 Explanation: Changing the first
	 * digit results in 6669. Changing the second digit results in 9969. Changing
	 * the third digit results in 9699. Changing the fourth digit results in 9666.
	 * The maximum number is 9969.
	 * 
	 * Example 2: Input: num = 9996 Output: 9999 Explanation: Changing the last
	 * digit 6 to 9 results in the maximum number.
	 * 
	 * Example 3: Input: num = 9999 Output: 9999 Explanation: It is better not to
	 * apply any change.
	 */
	@Test // + ive
	public void example1() {

		System.out.println(maximum69Number(9669));
		System.out.println(maximum69Number(9996));
		System.out.println(maximum69Number(9999));

	}

	@Test // Edge Case
	public void example2() {

		System.out.println(maximum69Number2(9669));
		System.out.println(maximum69Number2(9996));
		System.out.println(maximum69Number2(9999));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force 
	 * 1. Get the input number 
	 * 2. Convert it into string and take the first digit check whether its 6 or 9 
	 * 	if 6 then change to 9 and exit the loop 
	 * 	else move to the next element 
	 * 3. Convert the output string value as integer.
	 * 
	 */
	public int maximum69Number(int num) {

		String s = Integer.toString(num);
		String c[] = s.split("");
		String output = "";
		boolean flag=false;
		for (int i = 0; i < c.length; i++) {
			if (c[i].equals("6") && flag==false  ) {
				c[i] = "9";
				flag = true;
			}
			output = output + c[i];
		}
		// To remove this loop added a flag
		//		for (int i = 0; i < c.length; i++) {
		//
		//			output = output + c[i];
		//		}

		return Integer.parseInt(output);

	}
	
	//Another method by converting it into an char array
	/*1. Convert the given number to a string and then to a character array
	 * 2. Loop through the array and if char is 6 the chnage it to 9 and breka the loop
	 * 3. Using value of function available in Integer class retriving the number from the string which accepts a char array
	 * */
	
	
	public int maximum69Number2(int num) {
		
		char c[]= Integer.toString(num).toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='6') {
				c[i]='9';
				break;
			}
		}
		
		return Integer.valueOf(new String (c));
	}
}
