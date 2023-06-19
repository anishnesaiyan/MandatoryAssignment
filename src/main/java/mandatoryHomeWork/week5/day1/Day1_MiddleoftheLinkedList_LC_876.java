package mandatoryHomeWork.week5.day1;


class ListNode {
    int val;
  ListNode next;
  ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Day1_MiddleoftheLinkedList_LC_876 {

		public static void main(String[] args) {
			//ListNode n5= new ListNode(5, null);
			//ListNode n4= new ListNode(4, null);
			//ListNode n3= new ListNode(3, n4);
			//ListNode n2= new ListNode(2, n3);
			ListNode ll= new ListNode(1, null);
			
			ListNode temp= middleNode2(ll);
			
			// To print the result linked list
			 System.out.print("[");
			 while(temp!=null) {
				 System.out.print(temp.val+", ");
				 temp=temp.next;
			 }
			 System.out.print("]");

		}
		/*
		 * Algo:
		 * 1. Count the number of nodes
		 * 2. the miidle value will count/2 +1, assign the value again to count
		 * 3. again start the loop if i= count return the head at that position
		 */
		
		 public static ListNode middleNode(ListNode head) {
		        int count=0;
		        ListNode temp=head;
		     
		      if(head.next==null || head==null) return head;
		      //Loop to get the count of nodes
			 while(temp!=null) {
				 count++;
				 temp=temp.next;
			 }
			 System.out.println(count);
			 // Find the mid value
			 count=count/2+1;
			 System.out.println(count);
			 int i=1;
			 //Loop till count matches i and return head
			 while(head!=null) {
				if(i==count)return head;
				head=head.next;
				i++;
			 }
			 return null;
		    }
		 /*
			 * Algo:using two pointers
			 * While slow moves one step forward, fast moves two steps forward.
			 * 
				Finally, when fast reaches the end, slow happens to be in the middle of the linked list.
				For example, head = [1, 2, 3, 4, 5], I bolded the slow and fast in the list.
				step 0: slow: [1, 2, 3, 4, 5], fast: [1, 2, 3, 4, 5]
				step 1: slow: [1, 2, 3, 4, 5], fast: [1, 2, 3, 4, 5]
				step 2: slow: [1, 2, 3, 4, 5], fast: [1, 2, 3, 4, 5]
				end because fast cannot move forward anymore and return [3, 4, 5]
			 */
			
		 public static ListNode middleNode2(ListNode head) {
			 
			 ListNode slow = head, fast = head;
			 
		        while (fast != null && fast.next != null) {
		            slow = slow.next;
		            fast = fast.next.next;
		        }
		        return slow;
		    }
	}


