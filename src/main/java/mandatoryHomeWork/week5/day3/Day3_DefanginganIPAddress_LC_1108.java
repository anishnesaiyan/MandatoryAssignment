package mandatoryHomeWork.week5.day3;

import org.junit.Test;

public class Day3_DefanginganIPAddress_LC_1108 {
	/*
	 * https://leetcode.com/problems/defanging-an-ip-address/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}

	@Test // Edge Case
	public void example2() {
		String address = "255.100.50.0";
		System.out.println(defangIPaddr(address));
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here
	 * 1. Convert the string into char array
	 * 2. Using string builder (append the string if the char is '.'
	 * 
	 * 
	 */
public static String defangIPaddr(String address) {
        char a[]= address.toCharArray();
        
        StringBuilder defang= new StringBuilder();
        int i=0;
        while(i<address.length()) {
        	
        	if(a[i]=='.') {defang.append("[.]");}
        	else {defang.append(a[i]);}
        i++;
        }
        return defang.toString();
    }


// Using replace method

		public String defangIPaddr2(String address) {
			
		    return address.replace(".", "[.]");
		
		}
}
