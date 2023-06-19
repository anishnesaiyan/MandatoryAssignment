package mandatoryHomeWork.week4.day4;

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
public class Day4_ReverseLinkedList_LC_206 {

	public static void main(String[] args) {
		
		ListNode n2= new ListNode(2, null);
		ListNode ll= new ListNode(1, n2);
		
		ListNode temp= reverseList(ll);
		
		// To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");
	
	}

	/*Algo:
	 * 
	 * //Watch kunal linked list problem from 1:56 min video
	 * 
	 * Take three node
	 * 1. Previous to point null (as this becomes the last)
	 * 2. Present to head node
	 * 3. Next to present.next node
	 * 4. Now loop till present becomes null (Means previous becomes the head)
	 * 5. Assign present.next=previous (assign the next value of present as previous)
	 			 Previous = present (previos will b 			
	 * 
	 * */
	public static ListNode reverseList(ListNode head) {
        
		if(head==null) return head;
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

		return previous;
}}
