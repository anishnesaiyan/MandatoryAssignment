package mandatoryHomeWork.week8.day5;

import org.junit.Test;

public class Day5_CaesarCipher_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String caesarCipher = caesarCipher(
				"1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M", 27 % 26);
		System.out.println(caesarCipher);
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force
	 * 
	 * 
	 * 
	 */
	public static String caesarCipher(String s, int k) {
		int left = 0;
		int right = s.length() - 1;
		char[] arr = s.toCharArray();
		while (right >= left) {
			if (left < right) {
				arr[left] = convert(arr[left], k);
				arr[right] = convert(arr[right], k);
				left++;
				right--;
			} else if (left == right) {
				arr[right] = convert(arr[right], k);
				right--;

			}
		}

		String ans = new String(arr);
		return ans;


	}

	public static char convert(char con, int k) {
		char r = '\0';
		if ((int) con < 65 || (int) con > 122) {
			return con;
		}
		if ((int) con > 96 && (int) con < 123) {
			r = (con + k > 122) ? (char) (((con + k) % 122 + 96)) : (char) (con + k);
		} else

		if ((int) con > 64 && (int) con < 91) {
			r = (con + k > 90) ? (char) (((con + k) % 90 + 64)) : (char) (con + k);
		}
		return r;

	}
}
