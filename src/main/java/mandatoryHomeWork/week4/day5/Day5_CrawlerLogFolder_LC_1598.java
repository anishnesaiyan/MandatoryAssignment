package mandatoryHomeWork.week4.day5;

import java.util.Stack;

import org.junit.Test;

public class Day5_CrawlerLogFolder_LC_1598 {
	/*
	 * The Leetcode file system keeps a log each time some user performs a change
	 * folder operation.
	 * 
	 * The operations are described below: "../" : Move to the parent folder of the
	 * current folder. (If you are already in the main folder, remain in the same
	 * folder). "./" : Remain in the same folder. "x/" : Move to the child folder
	 * named x (This folder is guaranteed to always exist). You are given a list of
	 * strings logs where logs[i] is the operation performed by the user at the ith
	 * step.
	 * 
	 * The file system starts in the main folder, then the operations in logs are
	 * performed. Return the minimum number of operations needed to go back to the
	 * main folder after the change folder operations.
	 * 
	 * Example 1: Input: logs = ["d1/","d2/","../","d21/","./"]
	 * 
	 * Output: 2 Explanation: Use this change folder operation "../" 2 times and go
	 * back to the main folder. Example 2: Input: logs =
	 * ["d1/","d2/","./","d3/","../","d31/"] Output: 3
	 * 
	 * Example 3: Input: logs = ["d1/","../","../","../"] Output: 0
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {

		String S[] = { "d1/", "d2/", "../", "d21/", "./" };
		System.out.println(minOperations(S));
	}

	@Test // Edge Case
	public void example2() {
		String S[] = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		System.out.println(minOperations(S));
	}

	@Test // negative
	public void example3() {
		String S[] = { "d1/", "../", "../", "../" };
		System.out.println(minOperations(S));
	}

	/*
	 * Pseudo code here using stack 
	 * 1. Iterate till the size of array 
	 * 2. If array string is 
	 *    ./ -->dont do any thing 
	 *    ../ -->do pop operation if size>0 
	 *    else --> push the value
	 * 
	 */
	static public int minOperations(String[] logs) {

		Stack<String> s1 = new Stack<>();

		for (int i = 0; i < logs.length; i++) {

			if (logs[i].equals("./")) {
				continue;
				
			} else if (logs[i].equals("../")) {
				if (s1.size() > 0) {
					s1.pop();
				}
				
			} else {
				s1.push(logs[i]);
			}

		}

		return s1.size();
	}
}
