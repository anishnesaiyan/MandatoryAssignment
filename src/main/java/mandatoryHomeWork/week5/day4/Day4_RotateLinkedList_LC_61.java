package mandatoryHomeWork.week5.day4;

//import mandatoryHomeWork.week4.day4.ListNode;
//import week5.assignments.Day1_MiddleoftheLinkedList_LC_876;
//import week4.assignments.ListNode;

class ListNode {

	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) { 
		this.val = val; }
	
	ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; }
	
	
	


}
public class Day4_RotateLinkedList_LC_61 {

	public static void main(String[] args) {
		// https://leetcode.com/problems/rotate-list/
		
		ListNode n5= new ListNode(5, null);
		ListNode n4= new ListNode(4, n5);
		ListNode n3= new ListNode(3, n4);
		ListNode n2= new ListNode(2, n3);
		ListNode ll= new ListNode(1, n2);
		
		ListNode temp= rotateRight(ll,11);
		
		// To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");

	}
	
	/*Algo: 
	 * 1.Move the fast pointer to end and find the size
	 * 2. Move the slow pointer before kth value
	 * 3. Now move the pointers
	 * 	fast.next=head;
		head=slow.next;
		slow.next=null;
	 * */
	public static ListNode rotateRight(ListNode head, int k) {

		//Return head if the head has only one value or head itelf is null
		if(head==null|| head.next==null)return head;
		
		ListNode fast=head; 
		ListNode slow=head;
		int size;
		
		for (size = 1; fast.next!=null; size++) {
			fast=fast.next;
		}
		System.out.println(fast.val);
		
		//size-k%size -- It is the point we need to keep the slow pointer
		//k sometimes > list size so we are doing modulos of size
		for(int i=1;i<size-k%size;i++) {
			slow=slow.next;
		}
		System.out.println(slow.val);
		//End node points to head
		// Head will move to slow.next
		// make slow .next as null (break the relation)
		fast.next=head;
		head=slow.next;
		slow.next=null;
		
		return head;
		
    }
}
