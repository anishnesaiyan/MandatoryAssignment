package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Day1_GameOfTwoStack_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/game-of-two-stacks/problem
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		List<Integer> ls1= new ArrayList<>();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		ls1.add(4);
		ls1.add(5);
		List<Integer> ls2= new ArrayList<>();
		ls2.add(6);
		ls2.add(7);
		ls2.add(8);
		ls2.add(9);
		twoStacks(10,ls1,ls2);
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Create two pointers at start of both array list
	 * 2. check both points and add the lowest one to the sum
	 * 3. Loop until the sum value is less than target
	 * 
	 * 
	 */
			public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
				int count = 0;
				int left = 0;
				int right = 0;
				int totalSum = 0;
				while (totalSum <= maxSum) {
					if (left < a.size()) {
						count++;
						Integer l = a.get(left);
						totalSum += (l);
						left++;
					}
					if (right < a.size()) {
						count++;
						Integer r = a.get(right);
						totalSum += (r);
						right++;
					}

				}
				return count;
			}
		    
}
