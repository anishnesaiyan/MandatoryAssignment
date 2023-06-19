package mandatoryHomeWork.week4.day1;


/*
 * Create and implement Single and Doubly linkedlist with below methods: --YTS
		1. get(int index) - returns th eleement in the given index
		2. indexOf(int element) - return the index of the element or -1
 * 
 * */

public class Day1_SingleLinked_Implementation {
public static void main(String[] args) {
	SL s=new SL();
	s.add("3");
	s.add("2");
	s.add("1");
	s.add("4");
	s.add("5");
	System.out.println(s);
	s.get(6);
	s.indexOf("7");
}
}

class SL {

	class Node {
		String val = null;
		Node next = null;
	}

	Node start = null;
	int size = 0;
	
	//get the value if index is given
	 void get(int index) {
		 int count=1;
		 Node current = start;
		 if(index<1 || index>size) {
			 System.out.println("Invalid inputs where size is:"+ size +" and index is :"+index);
		 }
		 else {
		 while(count!=index) {
			 current=current.next;
			 count++;
		 }
		 System.out.println(current.val); 
		 }
	 }
	 
	 // Return the index for the given value
	 void indexOf(String element) {
		 Node current = start;
		 boolean found=false;
		 for (int i = 1; current!=null; i++) {
			if(current.val.equals(element)) {
				System.out.println("The value is at index"+i);
				found=true;
				break;
			}
			current=current.next;
		}
		 if(!found) {System.out.println("The Element not found");}
		 
		 
	 }
	// To add data
	void add(String data) {
		Node node = new Node();
		node.val = data;
		if (start == null) {
			start = node;
		} 
		//If start is not num we need find the position of the next null postion and insert the node to that position
		else {
			Node current = start;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		size++;
	}
	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.val + ", ");
			current = current.next;
		}
		sb.append("]");
		return sb.toString();

	}

}