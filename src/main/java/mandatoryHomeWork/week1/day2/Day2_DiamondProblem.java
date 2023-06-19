package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class Day2_DiamondProblem {

	/*
	 * Diamond Program 1. Get the input value n to print the number of lines of
			    * 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
	 */
	@Test // + ive
	public void example1() {
		twoSum_BruteForce(5);
	}

	private void twoSum_BruteForce(int n) {

		for (int row = 1; row <= 2 * n - 1; row++) {

			for (int column = 1; column <= n; column++) {
				// For incrementing rows
				if (row <= n) {
					if (column <= (n - row))
						System.out.print(" ");
					else {
						System.out.print("* ");}
				} 
				
				// For decrementing rows
				else {
					if (column <= (row - n))
						System.out.print(" ");
					else {
						System.out.print("* ");}
				}

			}
			System.out.println();
		}
	}
}
