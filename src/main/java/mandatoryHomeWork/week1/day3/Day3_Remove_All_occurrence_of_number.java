package mandatoryHomeWork.week1.day3;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.Test;

public class Day3_Remove_All_occurrence_of_number {
	/*
	 * Remove all occurrence of a number which is present in the given index number
		input = {1,2,3,4,5,1}, indexToRemove = 5
		output = {2,3,4,5}
	 * 
	 */
	@Test // + ive
	public void example1() {

		int a[] = { 1,2,3,4,5,1,1 };
		removeAllOccurence(a, 1);
	}

	@Test // Edge Case
	public void example2() {
		int a[] = { 3,1,1,1,1 };
		removeAllOccurence(a, 3);
	}

	@Test // negative
	public void example3() {
		int a[] = {1,1,1};
		removeAllOccurence(a, 2);
	}

	/*
	 * Pseudo code here 1. Brute force 
	 * 1. Get the array and find the number in the given array index
	 * 2. Traverse through the array and find the number of occurrence of the number
	 * 3. Create new array of size decrementing the occurrence of number
	 * 4. Now insert the element skipping the given digit
	 * 
	 * 
	 */
	private void removeAllOccurence(int[] array, int givenIndex) {
		
		int givenNumber = array[givenIndex];
		int count=0;
		//Find the occurrence of the number
		for (int i = 0; i < array.length; i++) {
			if(array[i]==givenNumber) count++;
		}
		//Creating new array excluding the given number

		int newArray[]= new int[array.length-count];
		for (int i = 0,j=0; i < array.length; i++) {
			
			if(array[i]==givenNumber) continue;
			else
				{newArray[j]=array[i];
				j++;}
		}
		System.out.println(Arrays.toString(newArray));
		
	}
}
