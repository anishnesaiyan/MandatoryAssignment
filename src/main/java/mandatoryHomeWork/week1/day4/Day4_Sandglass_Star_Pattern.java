package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class Day4_Sandglass_Star_Pattern {

	/*
	 * Sandglass Star Pattern
			Enter the number of rows: 5

			* * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
			    * 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
	 */
	@Test // + ive
	public void example1() {
		sandGlass(10);
	}

	private void sandGlass(int n) {

		for (int row = 1; row <= 2 * n; row++) {
			// Formula derived
			int c= row<=n?row-1:2*n-row;
			// Value determine the spaces to be printed before each line
			
			for (int column = 1; column <=n ; column++) {
				if(c>=column) {
				System.out.print(" ");}
				else System.out.print("* ");
					
			}
			System.out.println();
		}
	}
}
