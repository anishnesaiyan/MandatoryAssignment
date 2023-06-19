package mandatoryHomeWork.week6.day1;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Day1_SwapNodesPairs_LC_24 {

	public static void main(String[] args) {
		//ListNode n5= new ListNode(5, null);
		//ListNode n4= new ListNode(4, null);
		//ListNode n3= new ListNode(3, n4);
		//ListNode n2= new ListNode(2, null);
		ListNode ll = new ListNode(1, null);

		ListNode temp = swapPairs(ll);

		// To print the result linked list
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.val + ", ");
			temp = temp.next;
		}
		System.out.print("]");

	}
	/*Algo:
	1.Check head has only one value or head itself is null then return head
	2. Take two nodes at first and second position
	3. First swap the nodes and set the head as node2 [To retain head position]
	4. To swap further we need one more node as pre
	5. Loop until 
		if its has even numbers node1.next become null, 
		if its odd, node1.next.next becomes null
	6. Set the node positions
	7 a)if there are values after Node2
	  b)If there is no value after node 2)
	 * 
	 * */

	public static ListNode swapPairs(ListNode head) {

		//1.Check head has only one value or head itself is null then return head
		if(head==null || head.next==null) return head;
		//2. Take two nodes at first and second position
		ListNode node1=head;
		ListNode node2=node1.next;
		//3. First swap the nodes and set the head as node2 [To retain head position
		
		node1.next=node2.next;
		node2.next=node1;
		head=node2;
		
		//4. To swap further we need one more node as pre
		ListNode prev;
		//5. Loop until 
			//if its has even numbers node1.next become null, 
			//if its odd, node1.next.next becomes null
		
		while(node1.next!=null && node1.next.next!=null) {
		//6. Set the node positions
		prev=node1;	
		node1=node1.next;
		node2=node1.next;
		
		//7 a)if there are values after Node2
		if(node2.next!=null) {
			
		node1.next=node2.next;
		node2.next=node1;
		prev.next=node2;
		}
		//7b) If there is no value after node 2)
		else {
			prev.next = node2;
			node2.next=node1;
			node1.next=null;
		}
		}
		
		return head;
		
	}

}
