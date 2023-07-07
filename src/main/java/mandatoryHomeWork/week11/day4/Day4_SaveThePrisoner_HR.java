package mandatoryHomeWork.week11.day4;

import org.junit.Test;

public class Day4_SaveThePrisoner_HR {
	/*
	 * https://www.hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
System.out.println(saveThePrisoner(4,6,2));
	}

	@Test // Edge Case
	public void example2() {
		System.out.println(saveThePrisoner(4,6,2));
	}

	@Test // negative
	public void example3() {

	}

	/* https://www.youtube.com/watch?v=LeNU3WjrV_w
	 * Pseudo code here 
		1. m%n return the position if it satrt from 1 but here the clause is it satrts from s
		2. So we need to apply r+s-1
		3. Sometime this value goes greater han n so we modulo again with n
		4. if ans is zero means we have equally splitted so return n
		5. Else return the ans
		
	 * 
	 * 
	 * 
	 */
	public static int saveThePrisoner(int n, int m, int s) {
	    
		int r=m % n;
		int ans = (r + s - 1) % n;
		
		if(ans==0) {
			return n;
		}
		else return ans;
		
	    }
}
