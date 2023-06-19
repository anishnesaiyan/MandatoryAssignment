package mandatoryHomeWork.week8.day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Day5_SherlockAnagram_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s = "ifailuhkqq";
		System.out.println(sherlockAndAnagrams(s));
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
	public static int sherlockAndAnagrams(String s) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sNew = s.substring(i, j + 1).chars().sorted()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
				hm.put((sNew), hm.getOrDefault(sNew, 0) + 1);

			}

		}
		System.out.println(hm);
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if (set.size() > 1) {
			for (String key : hm.keySet()) {
				if (hm.get(key) > 1) {
					count++;
				}
			}
		} else {
			for (Integer val : hm.values()) {

				count += val;

			}

		}
		System.out.println(count);
		return count;

	}
}
