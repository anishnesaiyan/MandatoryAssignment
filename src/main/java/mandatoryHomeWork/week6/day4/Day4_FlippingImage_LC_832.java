package mandatoryHomeWork.week6.day4;

import java.util.Arrays;

import org.junit.Test;

public class Day4_FlippingImage_LC_832 {
	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
		int[][] output=flipAndInvertImage(image);
		for(int[] a:output) {
			
			System.out.println(Arrays.toString(a));
		}
		
		
	}

	@Test // Edge Case
	public void example2() {
		int image[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		
		int[][] output=flipAndInvertImage(image);
		for(int[] a:output) {
			
			System.out.println(Arrays.toString(a));
		}
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Create two loops outer for row and inner for column
	 * 2. Inside the second loop using two pointers swap from both end
	 * 3. Before swapping (if 0 modify to 1, if 1 change to zero}
	 * 
	 * 
	 */
	public int[][] flipAndInvertImage(int[][] image) {
		
		
		for (int i = 0; i < image.length; i++) {
			int k=image.length-1;
			for (int j = 0; j<=k; j++,k--) {
				//Modifying 0-->1 and 1-->0
				//If j=k we need modify only once so added in else par
				if(j!=k) {
				image[i][j]=(image[i][j]==0)?1:0;
				image[i][k]=(image[i][k]==0)?1:0;
					 }
				else {
					image[i][k]=(image[i][k]==0)?1:0;
					}
				
				//swap a=(a+b)-(b=a)
				image[i][j]=(image[i][j]+ image[i][k])-(image[i][k]=image[i][j]);

			}
		}

		return image;
        
    	}
}
