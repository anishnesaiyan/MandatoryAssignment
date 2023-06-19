package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class Day1_PyramidProblem {

	/*
	 * Pyramid Program
	 * 1. Get the input value n to print the number of lines of pyramid
	 * 2. Loop through for loop till the n values
	 * 3. Create a inner loop and n times ( So created a j variable and assigned n to j each times)
	 * 4. Decrement the j value one by one
	 * 5. Condition if j values is less than equal to i value print * or else print a space
	 * 6. After while loop come to a new line
	 */
	@Test // + ive
	public void example1() {
		//twoSum_BruteForce(5);
		twoSum_BruteForce2(5);
	}

	@Test // Edge Case
	public void example2() {
		twoSum_BruteForce(1);
	}

	@Test // negative
	public void example3() {
		twoSum_BruteForce(0);
	}

	private void twoSum_BruteForce(int n) {
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				int j = n;
				while (j != 0) {
					if (j <= i) {
						System.out.print("* ");
					} else {
						System.out.print(" ");
					}
					j--;
				} 
				System.out.println();

			}

		} else
			System.err.println("Invalid Input");
	}
	private void twoSum_BruteForce2(int n) {
		// Using Kunal Kushwaha

			for (int row = 1; row <= n; row++) {
				
				for (int column = 1; column <=n; column++) {
					
					if(column<=(n-row)) {
						System.out.print(" ");
					}
					else {
						System.out.print("* ");
					}					
				}
				System.out.println();
				
				
			}

	}
}
