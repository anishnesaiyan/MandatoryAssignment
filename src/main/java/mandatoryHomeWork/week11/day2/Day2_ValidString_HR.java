package mandatoryHomeWork.week11.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import org.junit.Test;

public class Day2_ValidString_HR {
	/*
	 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
String s="abcc";
System.out.println(isValid(s));
	}

	@Test // Edge Case
	public void example2() {
		String s="aabbccddeefghi";
		System.out.println(isValid(s));
	}

	@Test // negative
	public void example3() {
		String s="abccc";
		System.out.println(isValid(s));
	}

	/* https://www.youtube.com/watch?v=TidC-dG9C3s
	 * Pseudo code here 
	 * 1. Create a HashMap to store alphabets and count
	 * 2. Store the values in an array.
	 * 3. Now it has only three condtion
	 * 		if first and last are same return yes   --> means all are same
	 * 		if first =1 and second and second last are same return yes --> means only one is 1 and rest are same so we can remove 1
	 * 		if first = secondLast && lastValueis less by one value --> means one value is more than 1 and rest all are same
	 -- Whatever the postie cases it will fall in thsi conditon
	 * 
	 * 
	 */
	
	 public static String isValid(String s) {
		   HashMap<Character, Integer> hs= new HashMap<>();
		   //Create HashMap to store the alphabets and respective count
		   for (int i = 0; i < s.length(); i++) {
			   Character c=s.charAt(i);
			   hs.put(c, hs.getOrDefault(c, 0)+1);
		   }
		   //If it has only one value directly return yes
		   if(hs.size()==1) return "YES";
		   
		   //Store the values in hashmap to an array		   
		   Integer[] array= new Integer[hs.size()];
		   int i=0;		   
		   for(Character ch: hs.keySet()) {
			   array[i]=hs.get(ch);
			   i++;
		   }
		   
		   //Sort the array
		   Arrays.sort(array);
		   
		   int first=array[0];
		   int second=array[1];
		   int last= array[array.length-1];
		   int secondLast=array[array.length-2];
		   
		   //If first and last are same, then all are same
		   if(first==last) return "YES";
		   
		   //If first =1, and all other haave same frequency
		   if(first==1 && second==last) return "YES";
		 
		   //if all are equal excpet last one less by one value
		   if(first==secondLast && secondLast==last-1) return "YES"; 
		   
		   else {
			   return "NO";
		   }
		   
		   
		
		    }
}
