package mandatoryHomeWork.week1.day1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_Plus_One_LC_66 {
	/*
	 * You are given a large integer represented as an integer array digits, 
	 * where each digits[i] is the ith digit of the integer. 
	 * The digits are ordered from most significant to least significant in left-to-right order. 
	 * The large integer does not contain any leading 0's.
	 * Increment the large integer by one and return the resulting array of digits.
	 * 
	 * Eg1:Input: digits = [1,2,3]
		Output: [1,2,4]
		Explanation: The array represents the integer 123.
		Incrementing by one gives 123 + 1 = 124.
		Thus, the result should be [1,2,4].
	 * 
	 * Eg2:Input: digits = [4,3,2,1]
		Output: [4,3,2,2]
		Explanation: The array represents the integer 4321.
		Incrementing by one gives 4321 + 1 = 4322.
		Thus, the result should be [4,3,2,2].
		
		Eg3:Input: digits = [9]
		Output: [1,0]
		Explanation: The array represents the integer 9.
		Incrementing by one gives 9 + 1 = 10.
		Thus, the result should be [1,0].
	 */
	@Test // + ive
	public void example1() {

		//int a[]= {9,8,7,6,5,4,3,2,1,0};
		int a[]= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int b[]=plusOne_BruteForce2(a);
		System.out.println(Arrays.toString(b));
	}

	@Test // Edge Case
	public void example2() {
		int a[]= {9,9,9,9};
		int b[]=plusOne_BruteForce2(a);
		System.out.println(Arrays.toString(b));
	}

	@Test // negative
	public void example3() {
		//int a[]= {9};
		int a[]= {};
		int b[]=plusOne_BruteForce2(a);
		System.out.println(Arrays.toString(b));

	}

	/*
	 * Pseduo code here 1. Brute force
	 * Get the input array and make as an integer
	 * Add one to the integer
	 * Now convert integer into a string array
	 * Loop using the string array and convert each String into an integer and store it in integer array
	 * 
	 * 
	 */
	private int[] plusOne_BruteForce1(int[] digits) {
		// This solution is not working if the integer value is greater than Integer max value
		// eg: 728509129536673284379577474947011174006
		Long beforeSum = Long.parseLong(Arrays.toString(digits).replaceAll("[^0-9]", ""));
		System.out.println(beforeSum);
		//int afterSum=(int) (beforeSum+1);
		Long afterSum=beforeSum+1;
		String s[]=Long.toString(afterSum).split("");
		int size= s.length;
		int output[]= new int[size];
		System.out.println(afterSum);
		int i=0;
		while(i<size) {			
			output[i]=Integer.parseUnsignedInt(s[i]);
			i++;}	
	return output;
	}
	/*
	 * Pseduo code here 2. Brute force
	 * Traverse the input array from the end
	 * if the value of the index is less then 9 increment the value by 1 and return the same array
	 * if the value of the index is greater than 9, make the specific index value as zero and continue the loop
	 * 
	 * Specific for 9 only
	 * just declare an array with size +1 and make the zero index as zero 
	 * Other values in the array remains zero since int default value is zero
	 * 
	 * 
	 */
	private int[] plusOne_BruteForce2(int[] digits) {
		if(digits.length>0) {
		for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }
        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
	}
	else System.out.println("Invalid array");
		return digits;
	}	
}


