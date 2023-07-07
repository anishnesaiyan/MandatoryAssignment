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
	 * Pseudo code here //https://www.youtube.com/watch?v=WMmST9al0DE
	 * Note: If we think in normal way this wont works
	 * so we need to apply greedy algorithm
	 * 
	 * 1. Iterate through first list and get the max count
	 * 2. Now iterate to next loop and add the first value
	 * 		if(sum>maxSum && list1count>0)
	 * 		remove the one value from list1
	 * 		
	 * Complexity(o(m+n), space --> o(1)
	 * 
	 */
			public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
				
				
				int aCount = 0,  bCount=0, result=0, totalSum=0;
				//Loop through the first list and get the max count
				for(Integer aval:a) {
					if(totalSum+aval>maxSum) break;
					totalSum=totalSum+aval;
					aCount++;
				}
				//update result as aCount
				result=aCount;
				
				//Loop through the second list
				for(Integer bval:b) {
					totalSum=totalSum+bval;
					bCount++;
					while(totalSum>maxSum && aCount>0) { //if the toal sum is grater we will remove one value from a list
						totalSum=totalSum-a.get(aCount-1);
						aCount--;
					}
					//Update the result value
					result=totalSum>=maxSum ? Math.max(aCount+bCount, result):result;
			}
		    return result;
}}
