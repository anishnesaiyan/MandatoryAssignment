package mandatoryHomeWork.week8.day4;

import org.junit.Test;

public class Day4_MarsExploration_HackerRank {
	/*
	 * https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		String s="SeSSrSSOQ";
		System.out.println(marsExploration(s));
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force
	 * 
	 * 
	 * 
	 */
	public static int marsExploration(String s) {
	   	    int hlen=3;
	  if( s.length()%3!=0) {
		  return -1;
	  }
	    int good=0;
	    for(int i=0;i<s.length();){
	        String substring = s.substring(i, i+hlen);
	        good += isGood(substring);
	        i+=hlen;
	    }
		return good;
	    

	    }
	
	public static int isGood(String s) {
		int count=0;
	count+=	(s.charAt(0)=='S')?0:1;
	count+=	(s.charAt(1)=='O')?0:1;
	count+=	(s.charAt(2)=='S')?0:1;
	return count;
	}
}
