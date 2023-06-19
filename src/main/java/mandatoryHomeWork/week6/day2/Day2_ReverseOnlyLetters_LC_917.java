package mandatoryHomeWork.week6.day2;

import java.util.Arrays;

import org.junit.Test;

public class Day2_ReverseOnlyLetters_LC_917 {
	/*
	 * https://leetcode.com/problems/reverse-only-letters/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));
		
	}

	@Test // Edge Case
	public void example2() {
		String s = "ab-cd";
		System.out.println(reverseOnlyLetters(s));
	}

	@Test // negative
	public void example3() {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}

	/*
	 * Pseudo code here
	 * 1. Take two pointers one at start and another one at end
	 * 2.  If both index has characters swap it
	 * 3.  if i has char then decrement j
	 * 4.  If j has char then increment i
	 * 5   else increment i and decrement j
	 * 6. Finally print the values from char array using a string function
	 */
	 public static String reverseOnlyLetters(String s) {
	        char[] c=s.toCharArray();
	        int i=0; 
	        int j=c.length-1;
	        while(i<j) {
	        	
	        	if(((c[i]>='A' && c[i]<='Z' ) || (c[i]>='a' && c[i]<='z' )) && ((c[j]>='A' && c[j]<='Z' ) || (c[j]>='a' && c[j]<='z' ))) {
	        		char temp=c[i];
	        		c[i]=c[j];
	        		c[j]= temp;
	        		i++;
	        		j--;
	        	}
	        	else if((c[i]>='A' && c[i]<='Z' ) || (c[i]>='a' && c[i]<='z' )) {
	        		j--;
	        	}
	        	else if ((c[j]>='A' && c[j]<='Z' ) || (c[j]>='a' && c[j]<='z' )){
	        		i++;
	        	}
	        	else {
	        		i++;
	        		j--;
	        	}
	        	
	        }
		 
			return String.valueOf(c);	 
		 //return Arrays.toString(c).replace(", ", "").replace("[", "").replace("]", "");
	    }
	 
}
