package mandatoryHomeWork.week4.day5;


//import mandatoryHomeWork.week4.day4.ListNode;

class ListNode {

	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) { 
		this.val = val; }
	
	ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; }
	
	
	


}
public class Day5_PalindromeLinkedList_LC_234 {

	public static void main(String[] args) {
		
		ListNode n4= new ListNode(1, null);
		ListNode n3= new ListNode(2, n4);
		ListNode n2= new ListNode(2, n3);
		ListNode ll= new ListNode(1, n2);
		System.out.println(isPalindrome(ll));
		
		
	}
	
public static boolean isPalindrome(ListNode head) {
	//Watch kunal linked list problem from 1:56 min video
	
       //Take three nodes previous, present and next
	
	// 1--> 2-->3 --> 4--> 5 --> null
	
	//o/p: null<--1 <--2 <--3 <--4 <--5
		/*
		 * 1. Previous will start as null
		 * 2. Present will be head
		 * 3. next will head.next
		 * 
		 * 	present.next=previous
		 *  
		 *  //now move forward
		 *  previous = present
		 *  present=next
		 *  next=next.next
		 * -- Loop till present become null and return till previous
		 * */
	ListNode temp=head;
	if(head==null) return false;
	ListNode previous=null;
	ListNode present=head;
	ListNode next=present.next;
	
	while(present!=null) {
			present.next=previous;
			previous = present;
			present=next;
			if(next!=null) {
			next=next.next;}			
	}
	while(previous!=null) {
		int val1=previous.val;
		int val2=temp.val;
		
		if(val1!=val2) return false;
			
		previous=previous.next;
		temp=temp.next;

	}
	return true;
	
    }



}
