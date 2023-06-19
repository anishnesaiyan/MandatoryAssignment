package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class Day3_RightPascalTriangle {

	/*
	 * Right Pascal’s Triangle
			Enter the number of rows: 5
			
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
		rightPascal(10);
	}

	private void rightPascal(int n) {

		for (int row = 1; row <= 2 * n - 1; row++) {
			// Formula derived
			int c= row<=n?row:2*n-row;
			
			for (int column = 1; column <=c ; column++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
