package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class Day3_PowerOfTwo_LC_231 {

	/*
	 * Your Question here
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.
		An integer n is a power of two, if there exists an integer x such that n == 2x.
		
	 * Example 1:
		Input: n = 1
		Output: true
		Explanation: 20 = 1
		
		Example 2:
		Input: n = 16
		Output: true
		Explanation: 24 = 16
		
		Example 3:		
		Input: n = 3
		Output: false
	 */
	@Test // + ive
	public void example1() {
		//System.out.println(isPowerOfTwo(-16));
		//System.out.println(isPowerOfTwo(-8));
		
//		System.out.println(isPowerOfTwo(-1));
//		System.out.println(isPowerOfTwo(1));
//		System.out.println(isPowerOfTwo(68));
//		System.out.println(isPowerOfTwo(-68));
//		System.out.println(isPowerOfTwo(-64));
	System.out.println(isPowerOfTwo(-1));
//		
		
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force
	 * 1. Get the input number
	 * 2. If the number is 1 directly return true
	 * 3. If number is >1, put in a loop
	 * 		Find the remainder of by dividing the given number by 2
	 * 			- If remainder is 1 - directly return false
	 			- else find the quotient of the number and run the loop again
	 			- if the quotient is 1 at the end come out of the loop and return true
	 			- If n is not >1 , equal to 1 - return false 
	 * ,
	 * 
	 */
	public boolean isPowerOfTwo(int n) {
		int remainder = 0;
		if (n == 1)
			return true;
		else if (n > 1) {
				while (n != 1) {
					remainder = n % 2;
					if (remainder == 1)
						return false;
					n = n / 2;
				}
				return true;
		}
		return false;
	}
}

