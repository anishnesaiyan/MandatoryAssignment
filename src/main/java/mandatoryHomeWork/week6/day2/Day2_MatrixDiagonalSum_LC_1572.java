package mandatoryHomeWork.week6.day2;

import org.junit.Test;

public class Day2_MatrixDiagonalSum_LC_1572 {

	/*
	 * https://leetcode.com/problems/matrix-diagonal-sum/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
			int[][] a= {{1,2,3}, {4,5,6},{7,8,9}};
			System.out.println(diagonalSum(a));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Diagonal values have two conditions
	 * 		a)will have same index
	 * 		b) sum of index = length-1
	 * 2. If any of the given condition matches add to the sum
	 * 
	 * 
	 */
public static int diagonalSum(int[][] mat) {
       

	int sum=0;
	for (int i = 0; i < mat.length; i++) {
		
		for (int j = 0; j < mat.length; j++) {
			
			//Condition
			if(i==j || i+j==mat.length-1) {
				System.out.println(mat[i][j]);
				sum=sum+mat[i][j];
			}
		}
	}
	
	return sum;
    }
	//Another solution in single loop
		public int diagonalSum2(int[][] mat) {
		int n = mat.length; 
		int sum = 0; 
		for (int i = 0; i < n; i++) { 
		    //Sum the diagonal values
			sum += mat[i][i];
			//i=0 0=3-0-1 = 2 (diagonal)
			//i=1  1=3-1-1 ==1 (not diagonal)
			//i=2  2= 3-2-1 ==0 (diagonal)
		    if (i != n - i - 1) { 
		        sum += mat[i][n - i - 1]; 
		    }
		}
		return sum; 
}}
