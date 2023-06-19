package mandatoryHomeWork.week5.day5;
//import week4.assignments.ListNode;

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
public class Day5_ReverseLinkedListII_LC_92 {

	public static void main(String[] args) {
		ListNode n7= new ListNode(5, null);
		ListNode n6= new ListNode(40, n7);
		ListNode n5= new ListNode(30, n6);
		ListNode n4= new ListNode(20, n5);
		ListNode n3= new ListNode(10, n4);
		ListNode n2= new ListNode(2, n3);
		ListNode ll= new ListNode(1, n2);
		
//		ListNode n5= new ListNode(5, null);
//		ListNode n4= new ListNode(4, n5);
//		ListNode n3= new ListNode(3, n4);
//		ListNode n2= new ListNode(2, n3);
//		ListNode ll= new ListNode(1, n2);
		
		ListNode temp= reverseBetween(ll,3,6);
		//ListNode temp= reverseBetween2(ll,3,6);
		
		// To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");

	}
	//Ref: https://leetcode.com/problems/reverse-linked-list-ii/solutions/2311084/java-c-tried-to-explain-every-step/
	
	 public static ListNode reverseBetween(ListNode head, int left, int right) {
		 //If left=right, there will not be any rotation
		 if(left==right) return head;
		 ListNode prev= head;
		 
		 //Move the prev before left
		 for(int i=1;i<=left-1;i++) {
			 prev=prev.next;
		 }
		 //Move the current to the left
		 ListNode current=prev.next;
		 
		 //For Reversing
		 for (int i = 1; i < right-left; i++) {
			 
			ListNode forward=current.next; //Forward pointer will be after current
			
			current.next=forward.next;
			forward.next=prev.next;
			prev.next=forward;
		}
		 
		 return head;
	    }
	}
