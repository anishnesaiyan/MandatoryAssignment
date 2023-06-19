package mandatoryHomeWork.week8.day4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Day4_GameofThrones_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/game-of-thrones/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s="cdcdcdcdeeeef";
		System.out.println(gameOfThrones(s));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. 
	 * 
	 * 
	 */
	public static String gameOfThrones(String s) {

	    Map<Character,Integer> hm=new HashMap<>();
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
	    }
	    
	    for (char c : hm.keySet()) {
	        if(hm.get(c)%2!=0){
	            count++;
	        }
	    }
	    System.out.println("Count: "+count);
	    if(s.length()%2==0&&count==0){
	        return "YES";
	    }else if(s.length()%2!=0&&count==1){
	         return "YES";
	    }else{
	        return "NO";
	    }

	    }
}
