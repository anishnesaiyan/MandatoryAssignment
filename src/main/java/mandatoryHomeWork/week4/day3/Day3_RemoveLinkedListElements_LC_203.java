package mandatoryHomeWork.week4.day3;

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
public class Day3_RemoveLinkedListElements_LC_203 {

	public static void main(String[] args) {
		//Different inputs
		// 1,2,2,1 - remove 2
		// 3,2,1,1 - remove 1
		//1,1,1,1 = remove 1
		
//		ListNode n7= new ListNode(6, null);
//		ListNode n6= new ListNode(5, n7);
//		ListNode n5= new ListNode(4, n6);
		ListNode n4= new ListNode(1, null);
		ListNode n3= new ListNode(1, n4);
		ListNode n2= new ListNode(2, n3);
		ListNode ll= new ListNode(4, n2);
		
		ListNode temp= removeElements(ll,1);
		
		// To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");

	}
	/**
	 * Pseucode 
	 * 1. 
	 * 
	 */
	public static ListNode removeElements(ListNode head, int val) {
		//If input does not have any values
		if(head==null) return head;
		
		ListNode node=head;
		
		//For modifying the head if the first element itself the given value
		while(node.val==val) {
			if(node.next!=null) {
			head=node.next;
			node=node.next;
			}
			//if node.next is null and node is equal to value directly make the node null and return the node
			else {
				node=null;
				return node;
			}
		}
		
		//For the next set of matching values
		while(node.next!=null) {
			
			if(node.next.val==val && node.next.next!=null) {
				node.next=node.next.next;
				node=node.next;
				//If the current node is value moving the node back to the head to do the process again
				// input: 5,4,3,2,1,1
				if(node.val==val) {
					node=head;
				}
			}
			else if(node.next.val==val && node.next.next==null) {
				
				node.next=null;
				
			}
			//If node val=val
			//Input: [1,2,2,1]
			else if(node.val==val) {
				node=head;
			}
			else {
				node=node.next;
			}

		}

		
	
	return head;
	
    }

}
