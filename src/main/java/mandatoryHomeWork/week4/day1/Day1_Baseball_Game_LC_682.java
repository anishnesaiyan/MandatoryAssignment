package mandatoryHomeWork.week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Day1_Baseball_Game_LC_682 {

	/*
	 * LC 682 - Baseball Game
	 * 
	 * 
	 */
	@Test // + ive
	public void example1() {
		// String[] ops= {"5","2","C","D","+"};
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		calPoints(ops);
	}

	@Test // Edge Case
	public void example2() {

		String[] ops = { "1", "C" };
		calPoints(ops);
	}

	@Test // negative
	public void example3() {

	}

	/*
	 * Pseudo code here 
	 * 1. Loop through a array and get each values using array 
	 * 2.Create a try catch block where numbers will be validated in try and letters will be added up in catch 
	 * 3. Store the results in an list 
	 * 4. Finally print the list
	 */

	public int calPoints(String[] operations) {

		int output = 0;
		List<Integer> ls = new ArrayList<>();
		for (int i = 0, j = 0; i < operations.length; i++) {

				if (operations[i].equals("+")) {
					ls.add(j, ls.get(j - 1) + ls.get(j - 2));
					j++;

				} else if (operations[i].equals("D")) {
					ls.add(j, ls.get(j - 1) * 2);
					j++;

				} else if (operations[i].equals("C")) {
					j--;
					ls.remove(j);

				}
				//For numbers
				else {
					ls.add(Integer.parseInt(operations[i]));
					j++;
				}
		}

		for (int a : ls) {
			output = output + a;
		}
		System.out.println(ls);
		System.out.println(output);

		return output;
	}
}
