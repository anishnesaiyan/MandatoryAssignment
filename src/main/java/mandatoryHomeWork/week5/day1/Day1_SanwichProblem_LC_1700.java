package mandatoryHomeWork.week5.day1;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Day1_SanwichProblem_LC_1700 {
	/*
	 * https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		
		int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};
		
		System.out.println(countStudents(students,sandwiches));

	}

	@Test // Edge Case
	public void example2() {
		int[] students = {1,1,1,0,0,1}, sandwiches = {1,0,0,0,1,1};
		
		System.out.println(countStudents(students,sandwiches));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Loop through the students and find how many one and how many zeros are there
	 * 2. Loop through the sandwiches and verify
	 * 		if sandwich is 0 and countZero>0 -- decrement zero's count by 1
	 * 		else if sandwich is 1 and count1>0 -- decrement one's count by 1
	 * 		else break the loop and return the remaining count one + count zeros
	 * 
	 * 
	 */
	public static int  countStudents(int[] students, int[] sandwiches) {
                
	        int countOne = 0;
	        int countZero = 0;
	        // Find the count of students who like 0 or 1
	        for (int item : students) {
	            if (item == 1) {
	                countOne++;
	            } else {
	                countZero++;
	            }
	        }
	        //Loop through the sandwich
	        for (int sandwich : sandwiches) {
	            if (sandwich == 1 && countOne > 0) {
	                countOne--;
	            } else if (sandwich == 0 && countZero > 0) {
	                countZero--;
	            } else {
	                return countOne + countZero;
	            }
	        }

	        return 0;
	
    }
}
