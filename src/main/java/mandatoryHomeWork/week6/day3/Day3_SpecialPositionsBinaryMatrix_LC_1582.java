package mandatoryHomeWork.week6.day3;

import org.junit.Test;

public class Day3_SpecialPositionsBinaryMatrix_LC_1582 {

	/*
	 *https://leetcode.com/problems/special-positions-in-a-binary-matrix/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int[][] a= {{1,0,0},{0,0,1},{1,0,0}};
		System.out.println(numSpecial(a));
	}

	@Test // Edge Case
	public void example2() {
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println(numSpecial(a));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
		1. First loop through array row length
	 * 2. Second loop till the column length
	 * 3. If the value =1 , then send it to a method to check whether the corresponding row and columns are 0 then return true
	 * 4. If method return true increase the count
	 * 
	 * 
	 * 
	 *	Algo inside method:
	 *	1. Get the array
	 *		i and j == where the value is 1
	 *		m= row
	 *		n= column
	 *	2. first loop for verifying across the rows
	 *			column will be fixed 
	 *			row starts from zero
	 *			if row=i, then skip
	 *			else if check the index is 1 then directly return false
	 *			else increment k
	 *	3. first loop for verifying across the column
	 *			row will be fixed 
	 *			column starts from zero
	 *			if column=j, then skip
	 *			else if check the index is 1 then directly return false
	 *			else increment l
	 *		
	 * 
	 */
	public static int numSpecial(int[][] mat) {
        int m=mat.length; //Row
        int n=mat[0].length; //Column
        int count=0;
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < n; j++) {
				if(mat[i][j]==1) {
					
					if(numSpecial(mat,i,j,m,n)) count++;
				}
			}
			
		}
		return count;
    }
	public static boolean numSpecial(int[][] mat,int i, int j,int m, int n) {

		int k=0;
		int l=0;
        while(k<m) {
        	if(k==i) {k++;continue;}
        	else if(mat[k][j]==1) {return false;}
        	
        	k++;
        }
        while(l<n) {
        	if(l==j) {l++;continue;}
        	else if(mat[i][l]==1) {return false;}
        	
        	l++;
        }
		
		return true;
	}
}
