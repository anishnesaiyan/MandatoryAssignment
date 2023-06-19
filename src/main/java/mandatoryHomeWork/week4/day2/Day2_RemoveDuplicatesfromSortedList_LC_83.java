package mandatoryHomeWork.week4.day2;

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
public class Day2_RemoveDuplicatesfromSortedList_LC_83 {
	public static void main(String[] args) {
		
//		ListNode n51= new ListNode(3,null);
//		 ListNode n41= new ListNode(3,n51);
		 ListNode n31= new ListNode(2,null);
		 ListNode n21= new ListNode(1,n31);
		 ListNode l1= new ListNode(1,n21);
		 //ListNode l2= new ListNode(1,null);
		 
		 ListNode temp=deleteDuplicates(l1);
		 
		 // To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");
	}

	public static ListNode deleteDuplicates(ListNode node) {
		// We need to return the head so created a head node copy of node
		 ListNode head=node;
		 // if node is null
		 if(node==null) return node;
		
		 //Loop till node.next is not null
		while(node.next!=null) {
			
			if(node.val==node.next.val) {
				
				node.next=node.next.next;
				
				
			}
			else{
				node=node.next;}
		}
	
		return head;
        
    }
	
}
