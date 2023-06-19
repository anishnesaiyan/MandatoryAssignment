package mandatoryHomeWork.week1.day5;

import org.junit.Test;

public class Day5_Count_of_matches_in_tournament_LC_1688 {

	/*
	 * You are given an integer n, the number of teams in a tournament that has strange rules:

		If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
		If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
		Return the number of matches played in the tournament until a winner is decided.
 Example 1:
	Input: n = 7
	Output: 6
	Explanation: Details of the tournament: 
	- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
	- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
	- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
	Total number of matches = 3 + 2 + 1 = 6.
Example 2:
	Input: n = 14
	Output: 13
	Explanation: Details of the tournament:
	- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
	- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
	- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
	- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
	Total number of matches = 7 + 3 + 2 + 1 = 13.
	 */
	@Test // + ive
	public void example1() {
	System.out.println(numberOfMatches(14));	
	}

	@Test // Edge Case
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 1. Brute force
		1. Get the n (team) value
		2. Match value is n/2 = teams /2
		2. if n is even don't change the value
		4. If n is odd increment the match  value by +1;
		5. Loop till n reaches 1
	 * 
	 */
public int numberOfMatches(int n) {
	 int matches=0, total=0;
		     while(n!=1) {
		     	matches=n/2;
		     	//for even teams
		     	if(n%2==0) {
			        	n=matches;
			        	}
		     	// for odd teams
			        else {
			        	n=matches+1;
			        	}
		     	total=total+matches;
		     }
			return total;
 }
   
}

