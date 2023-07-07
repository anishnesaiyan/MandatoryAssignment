package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		Random rm= new Random();
		  int randomindex = rm.nextInt(ls.size()-1);
		  System.out.println(randomindex);
	}

}
