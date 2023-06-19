package mandatoryHomeWork.week5.day4;

import org.junit.Test;

public class Day4_FinalValue_LC_2011 {
	/*
	 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
	 * 
	 *Should not use String equals method
	 */
	@Test // + ive
	public void example1() {
		String operations[] = {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}

	@Test // Edge Case
	public void example2() {
		String operations[] = {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}

	@Test // negative
	public void example3() {
		String operations[] = {"X++","++X","--X","X--"};
		System.out.println(finalValueAfterOperations(operations));
	}

	/*
	 * Pseudo code here 
	 * 1. Loop through each string and pick the index1  char and perform the operation
	 * 2. If it is - then do decrement
	 * 3. If its is + then do increment
	 * 
	 * 
	 */
public static int finalValueAfterOperations(String[] operations) {
    int val=0;
	for (int i = 0; i < operations.length; i++) {
		if(operations[i].charAt(1)=='-') {
			val--;
		}
		else if(operations[i].charAt(1)=='+') {
			val++;
		}
		
		
	}
	return val;
    }
}
