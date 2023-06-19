package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Day5_Diamond_Pattern2_copy {

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
		int n= (int)character-64;
		//System.out.println(n);
		int c=n;
		
		for(int row=1;row<=2*n-1;row++) {
			
			for (int column = 1; column <= c; column++) {
				
				if(column<=n-row || column==n+row )
				System.out.print(" ");
				else System.out.print('A');
				
			}
			System.out.println();
			c=row<=n?c++:c--;
			
		}
	}
}