package mandatoryHomeWork.week6.day4;

import org.junit.Test;

public class Day4_90_degree_increments_LC_1886 {
	/*
	 * https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int mat[][] = {{0,1},{1,0}};
		int target[][] = {{1,0},{0,1}};
		System.out.println(findRotation2(mat, target));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {
		int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
		int target[][] = {{1,1,1},{0,1,0},{0,0,0}};
	 System.out.println(findRotation2(mat, target));
	}

	/*
	 * Pseudo code here 1. Brute force
	 * 
	 * 
	 * 
	 */
	
	
	public static boolean findRotation2(int[][] a, int[][] b) {
        
		int n=a.length;
		
		int c90=0,c180=0,c270=0,c0=0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				//b[0][0]=a[4-0-1][0]==a[3][0]
				if(b[i][j]==a[n-j-1][i]) 
					c90++;
				if(b[i][j]==a[n-i-1][n-j-1])
					c180++;
				if(b[i][j]==a[j][n-i-1])
                    c270++;
                if(b[i][j]==a[i][j])
                    c0++;
				
			}
			
		}
		 if(c90==n*n||c270==n*n||c180==n*n||c0==n*n)
		 return true;
		 else return false;
    }
}
