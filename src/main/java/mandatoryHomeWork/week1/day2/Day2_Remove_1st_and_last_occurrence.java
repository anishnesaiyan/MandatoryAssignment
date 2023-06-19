package mandatoryHomeWork.week1.day2;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.Test;

public class Day2_Remove_1st_and_last_occurrence {
	/*
	 * Your Question here Remove the first and last occurrence of a given number in
	 * the input array input = {1,2,3,4,5,1}, number = 1 output = {2,3,5} input =
	 * {1,2,3,4,5,1,1}, number = 1 output = {2,3,5,1}
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[] = { 1,2,3,4,5,1,1 };
		contains(a, 1);
	}

	@Test // Edge Case
	public void example2() {
		int a[] = { 3, 1,1,1,1 };
		contains(a, 3);
	}

	@Test // negative
	public void example3() {
		int a[] = {1,1,1};
		contains(a, 3);
	}

	/*
	 * Pseudo code here 1. Brute force 
	 * 1. Get the input array and find the index of first and last position of an array and count the number of occurence
	 * 2. If count<1 - print the array {because there is no matching digit)
	 * 3. Or Create a new array of size -2 or -1 based on the count value than the previous array 
	 * 		if count>1, length-2
	 * 		if count= 1, length -1
	 * 4. loop through the array with i for old array and j for new array -
	 * 		 If digits and array[i] equals && (i=first index|| i=last index) 
				then continue to next iteration
			else store the value of old array to new array and increment j;
	 * 5. Finally print the new array
	 * 
	 * 
	 */
	private void contains(int[] array, int digit) {

		int firstIndex=0, lastindex = 0, count=0;
		//To find the occurrence of first index, last index, count of occurrence(to declare the array size)
		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == digit && count==0) {
					firstIndex=i;
					count++;
				}
				else if(array[i] == digit) {
					lastindex = i;
					count++;
				}

			}
			System.out.println(firstIndex);
			System.out.println(lastindex);
			System.out.println(count);
			//If count value is zero we can directly print the array
			if(count<1) {
				System.out.println(Arrays.toString(array));
			}
			// If the count value >1 = array size will be decreased two than the original array
			// else array size will be decreased one than the original array
			else {
			int newArraySize;
			if(count>1) newArraySize=array.length-2;	
			
			else newArraySize=array.length-1; 
				
			int newArray[]= new int[newArraySize];
			for (int i = 0,j=0; i < array.length; i++) {
				if(array[i]==digit && (i==firstIndex|| i==lastindex)) {
					continue;
				}
				else
				{
					newArray[j]=array[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(newArray));
			}

		}
	}
}
