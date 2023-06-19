package mandatoryHomeWork.week5.day2;

//import mandatoryHomeWork.week4.day4.ListNode;

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
public class Day2_RemoveNthNodeFromEndofList_LC_19 {

	public static void main(String[] args) {
		ListNode n5= new ListNode(5, null);
		ListNode n4= new ListNode(4, n5);
		ListNode n3= new ListNode(3, n4);
		ListNode n2= new ListNode(2, n3);
		ListNode ll= new ListNode(1, n2);
		
		ListNode temp= removeNthFromEnd2(ll,1);
		
		// To print the result linked list
		 System.out.print("[");
		 while(temp!=null) {
			 System.out.print(temp.val+", ");
			 temp=temp.next;
		 }
		 System.out.print("]");

	} 
	/*Algo:
	 * 1. Loop and get the size of LL stored in count
	 * 2. If LL of one element and n=1 directly assign head as null
	 * 3. If count and n value are same , means we have to move head to next position
	 * 4. If none of the above condition satisfied 
	 * 		1. Loop through each node and reach the node previous to the node to be removed (count=count-n)
	 * 		2. Then point temp.next to temp.next.next
	 * 		
	 * 
	 * 
	 * */
	
public static ListNode removeNthFromEnd(ListNode head, int n) {
     
			int count=0;
		  ListNode temp=head;
		 //Handle id there are only one element
		  if(head.next==null && n==1) return head=null;
		  
		  
		 while(temp!=null) {
			 count++;
			 temp=temp.next;
		 }
		 //again bringing temp back to head
		 temp=head;
		 System.out.println(count);
		 
		//identify the position to point to the next node
		 count=count-n;	
		// If count and n value are same , means we have to move head to next position 
		 if(count==0) {
			 return head=head.next;
		 }
		 //
		 int i=1;
		 while(temp!=null) {
			 if(count==i) {
				temp.next=temp.next.next;
				break;
			 }
			 i++;
			 temp=temp.next;
		 }
		 
	
	return head;
    }

//Another method using slow and fast pointers
//Move the fast pointers till the n posotion
//Now in a loop move the fast pointer till the end and slow pointer one by one
//Now move the slow pointer next to slow.next.next
public static ListNode removeNthFromEnd2(ListNode head, int n) {
	
	    ListNode fast = head, slow = head;
	    
	    for (int i = 1; i <= n; i++) fast = fast.next;
	    
	    if (fast == null) return head.next;
	    
	    while (fast.next != null) {
	        fast = fast.next;
	        slow = slow.next;
	    }
	    
	    slow.next = slow.next.next;
	    return head;
}

}
