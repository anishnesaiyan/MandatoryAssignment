package mandatoryHomeWork.week5.day5;

import org.junit.Test;

public class Day5_BalancedString_LC_1221 {
	/*
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s ="RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}

	@Test // Edge Case
	public void example2() {
		String s ="RLRRRLLRLL";
		System.out.println(balancedStringSplit(s));
	}

	@Test // negative
	public void example3() {
		String s ="LLLLRRRR";
		System.out.println(balancedStringSplit(s));
	}

	/*
	 * Pseudo code here 
		1. Split into a char array
		2. After each iteration
		 if the if the value is R increase count
		  if its L increase L count
		3. Check if R and L counts are matching
		4. If yes increase the count as 1 and reset Lcount and Rcount
		 
	 * 
	 * 
	 * 
	 */
public static int balancedStringSplit(String s) {
	
	char a[]= s.toCharArray();
	int rCount=0,lCount=0,count=0;
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]=='R') rCount++;
		else lCount++;
		if(rCount==lCount) {
			count++;
			rCount=0;
			lCount=0;
		}
	}
       
	return count;
    }
}
