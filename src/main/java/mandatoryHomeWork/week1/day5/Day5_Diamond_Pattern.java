package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Day5_Diamond_Pattern {

	/*
	 * Diamond Pattern in Java Enter a Character between A to Z : F
	 * 
	 * A B B C C D D E E F F E E D D C C B B A
	 */
	@Test // + ive
	public void example1() {
		rightPascal('F');
	}

	private void rightPascal(char character) {
		int n = 0;
		int loop = 0;
		char cha = 'A';
		for (char count = 'A'; count <= character; count++) {
			n++;
		}

		loop = n;
		for (int row = 0; row < 2 * n - 1; row++) {
			// For Increasing order
			
			for (int col = 1; col <= loop; col++) {
			if (row < n) {
				if (col == n - row)
					System.out.print(cha);
				else if (col == n + row)
					System.out.print(cha);
				else
					System.out.print(" ");
			}
			else {
				if (col == n-(loop/2 - 1))
					System.out.print(cha);
				else if (col == n+(loop/2 - 1))
					System.out.print(cha);
				else
					System.out.print(" ");
			}
				//Row 6 loop 10 (col 2 coln 10)
			}
			if (row < n-1) {
				loop++;
				cha++;
			} else {

				loop--;
				cha--;
	
			}
			System.out.println();

		}
	}
}