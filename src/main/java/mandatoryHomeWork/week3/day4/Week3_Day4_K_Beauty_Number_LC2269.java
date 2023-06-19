package mandatoryHomeWork.week3.day4;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.Test;


public class Week3_Day4_K_Beauty_Number_LC2269 {

	/*
	 * Your Question here
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		int num = 30003, k = 3;
		System.out.println(divisorSubstrings2( num,  k));
        

	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here sliding window using inner loop
	 * 1. Convert the number into a string
	 * 2. convert the string into a char array
	 * 3. Two loops
	 * 		--Inner loop will combine the values into an string based on k value
	 * 		-- Outer loop convert the string into integer and check the condition
	 * 			if its zero -- skip
	 * 			if its divisible by k increase the count
	 * 4. Print the count
	 * 
	 * 
	 */
	
	private int divisorSubstrings(int num, int k) {
        
		String temp = Integer.toString(num);
		char ch[]=temp.toCharArray();
		int count=0;
		for (int i = 0, right=k-1; right < ch.length; i++, right++) {
			
			String s="";
			//Combining the numbers into a string based on k value
			for (int j = i; j<=right;j++) {			
			s= s+ch[j]+"";
			}
			//System.out.println("String  "+ s);
			//Convert the string into a number
			int a=Integer.parseInt(s);
			//System.out.println("int a  "+ a);
			//Skip if the intger is zero
			if(a==0) continue;
			//If the input value is divisible by a add the count
			else if(num%a==0) count++;
		}
				
		return count;
    }
	
	// Sliding window using substring function
private int divisorSubstrings2(int num, int k) {
        //30003
		String temp = Integer.toString(num);
		int count=0;
	
		for (int i = 0, right=k-1; right<temp.length(); i++, right++) {
			//Combining the using substring
			String s= temp.substring(i,right+1);
			System.out.println("String  "+ s);
			//Convert the string into a number
			int a=Integer.parseInt(s);
			//System.out.println("int a  "+ a);
			//Skip if the intger is zero
			if(a==0) continue;
			//If the input value is divisible by a add the count
			else if(num%a==0) count++;
		}
				
		return count;
    }
}
