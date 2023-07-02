package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Day1_Sparse_Arrays_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/sparse-arrays/problem
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		List<String> stringList= new ArrayList<>();
		stringList.add("aba");
		stringList.add("baba");
		stringList.add("aba");
		stringList.add("xzxb");
		List<String> queries= new ArrayList<>();
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");
		matchingStrings(stringList,queries);
		
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Store the value in Hashmap with string as key and count as value
	 * 2. Now loop through the queries and store the values in a list
	 * 
	 * 
	 */
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
		
		HashMap<String, Integer> hs= new HashMap<>();
		List<Integer> result= new ArrayList<>();
		for (int i = 0; i < stringList.size(); i++) {
			
			if(hs.containsKey(stringList.get(i))) {
				hs.put(stringList.get(i), hs.get(stringList.get(i))+1);
			}
			else {
				hs.put(stringList.get(i), 1);
			}
			
		}
		for (int i = 0; i < queries.size(); i++) {
			if(hs.containsKey(queries.get(i))) {
				result.add(hs.get(queries.get(i)));
			}
			else
				result.add(0);
		}
		return result;
	}
}
