package mandatoryHomeWork.week5.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class Day3_RingsandRods_LC_2103 {
	/*
	 * https://leetcode.com/problems/rings-and-rods/
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String rings = "B0R0G0R9R0B0G0G9B9";
		System.out.println(countPoints2(rings));
		
	}

	@Test // Edge Case
	public void example2() {
		String rings = "B0R0G0R9R0B0G0";
		System.out.println(countPoints2(rings));
	}

	@Test // negative
	public void example3() {
		String rings = "G4";
		System.out.println(countPoints2(rings));
	}

	/*
	 * Pseudo code here (took 7ms)
		1. Split the string as String array
		2. Iterate through the array and add it to hashmap (index to key and colors as value)
			- If the map already contains the key it appends with existing one (used + operator)
		3. Get the keys from the hash map which return in set
		4. Store all the values in set to a list (becoz from set we can's retrieve data)
		5. Then create a method to check if the given input string has RGB if yes return true
		6. Iterate using the list and got the value from hashmap
			- pass the string to RGB chk method if returns true increase the count
		7. Finally return the count
	 */
	public static int countPoints(String rings) {

	    String[] split= rings.split("");
	    HashMap<String,String> hs= new HashMap<>();
	    int count=0;
	    
	    for (int i = 1; i < split.length;i=i+2) {
	    	if(hs.containsKey(split[i])) {
	    	hs.put(split[i], hs.get(split[i])+split[i-1]);
	    	}
	    	else {
	    		hs.put(split[i], split[i-1]);
	    	}
		}

	    Set<String> keySet = hs.keySet()	;
	    ArrayList<String> al= new ArrayList<>();
	    al.addAll(keySet);
	    
		for (String s: al) {
			
			if(rgbChek(hs.get(s))) count++;
		}	

		System.out.println(hs);
		return count;
	    }
	//Method to check given string has RGB
	public static boolean rgbChek(String input) {
		boolean boolean1=false,boolean2=false,boolean3=false;
		for (int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i)=='R') boolean1= true;
			else if(input.charAt(i)=='G') boolean2 =true;
			else if(input.charAt(i)=='B') boolean3 =true;
		}
		return boolean1 && boolean2 && boolean3;
	}
	
	//Another solution from Leetcode (Took just 0 ms)
	/*1. Create three arrays for r,g,b colurs of size 10
	 * 2. Loop through the string 
	 * 		if the char is r and index is 9 --> Update the value of index 9 of r array as 1 
	 * 3. Like wise update the respective index values
	 * 4. if we are adding in the same index value will indexvalue+1
	 * 5. Create another which will traverse through the array
	 * 6. If index whixh has value>0 take that in count and ignore the resst
	 * 7. Finally return the count
	 * */
	
	public int countPoints2(String rings) {
		// "B0R0G0R9R0B0G0G9B9";
	    int[] r=new int[10];
	    int[] g=new int[10];
	    int[] b=new int[10];
	    int count=0;
	    //To update the values in array
	    for(int i=0;i<rings.length()-1;i=i+2) {
	    	int index= rings.charAt(i+1)-'0';
	    	
	    	if(rings.charAt(i)=='R') {
	    		r[index]=r[index]+1;
	    	}
	    	else if(rings.charAt(i)=='G') {
	    		g[index]=g[index]+1;
	    	}
	    	else if(rings.charAt(i)=='B') {
	    		b[index]=b[index]+1;
	    	}
	    }
	    //To find count when all index has value>0
	    for (int i = 0; i < r.length; i++) {
			if(r[i]>0 && g[i]>0 && b[i]>0) {
				count++;
			}
			
		}
	    return count;
	}
}
