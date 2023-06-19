package mandatoryHomeWork.week1.day2;

import java.util.Arrays;

import org.junit.Test;

public class Day2_Add_Digit_LC_258 {
	/*
	 * Given an integer num, repeatedly add all its digits 
	 * until the result has only one digit, and return it.
	 * 
	 * Eg1:Input: num = 38
		Output: 2
		Explanation: The process is
		38 --> 3 + 8 --> 11
		11 --> 1 + 1 --> 2 
		Since 2 has only one digit, return it.
	 * 
	 * Eg2:Input: num = 0
			Output: 0
	 */
	
	
	@Test // + ive
	public void example1() {

		int num=38;
		addDigits(num);
		//Method2
		addDigits2(38);
	}

	@Test // Edge Case
	public void example2() {
		int num=911111111;
		addDigits(num);
		//Method2
		addDigits2(911111111);
	}

	@Test // negative
	public void example3() {
		int num=-1;
		addDigits(num);
		//Method2
		addDigits2(-1);

	}

	/*
	 * Pseduo code here 1. Brute force
	 * 1. Get the number and split the digit and store in char array if size is greater than 1
	 * 2. Add both the digit
	 * 3. If the number of digit is 1 then return the number or else run the process again
	 * 
	 * 
	 */
	public int addDigits(int num) {
		
		int target=0;
		if(num>1) {
		while(Integer.toString(num).length()!=1) {
			char array1[]=Integer.toString(num).toCharArray();
			for(int i=0;i<array1.length;i++) {
				//if we decremnt the char value of integer with '0' char we will get the resultant integer
				target= (array1[i]-'0')+target;
			}
				num=target;
				target=0;
		}
		System.out.println(num);
		return num;
		}
		else {
			System.out.println(num);
			return num;
			
		}
    }
	//Pseudocode method 2
	//Easy method got from LC submission 
	// if num==0 directly return 0
	// else num=num%9
	// if num%9 ==0 return as 9 or else return the modulus value
	public int addDigits2(int num) {
        if(num == 0)
            return 0;
        num %= 9;
        return num == 0 ? 9 : num;
    }
	
	//Jotheesh method using % split
	// If num>=10 -- pass it to the digit add method and sum the individual digits
	//	if num<10 - print
		//or else send it again to digit add method
	static int add(int num) {
		while (num >= 10) {
			num = digitAdd(num);
		}
		return num;
	}
	public static int digitAdd(int temp) {
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		return sum;
	}
}


