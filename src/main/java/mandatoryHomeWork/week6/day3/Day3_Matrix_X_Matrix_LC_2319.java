package mandatoryHomeWork.week6.day3;

import org.junit.Test;

public class Day3_Matrix_X_Matrix_LC_2319 {

	/*
	 * https://leetcode.com/problems/check-if-matrix-is-x-matrix/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int[][] a= {{2,0,0,1}, {0,3,1,0},{0,5,2,0},{4,0,0,2}};
		System.out.println(checkXMatrix(a));
	}

	@Test // Edge Case
	public void example2() {
		int[][] a= {{5,7,0}, {0,3,1},{0,5,0}};
		System.out.println(checkXMatrix(a));
	}

	@Test // negative
	public void example3() {
		int[][] a= {{1}};
		System.out.println(checkXMatrix(a));
	}

	/*
	 * Pseudo code here 
		1. Loop through the array
		2. to verify diagonal I and j should be same 
								also i+j =length-1
		3. Check the daigonal values are >0 then continue else return false
		4. For other index check whether those value are =0
			else directly return false;
	 * 
	 * 
	 * 
	 */
	 public static boolean checkXMatrix(int[][] grid) {
	      
		
		 for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				
				//For diagonal
				if(i==j || i+j==grid.length-1) {
					
					if(grid[i][j]==0) return false;
				}
				//For other values
				else if(grid[i][j]>0) {
					return false;
				}
				
			}
		}
		 return true;
	    }
}
