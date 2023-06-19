package mandatoryHomeWork.week4.day1;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {

	int val;
	ListNode next;
	
	ListNode() {}
	
	ListNode(int val) { 
		this.val = val; }
	
	ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; }
	
	
	


}

public class Day1_Merge_Sorted_Lists_LinkedLst_LC_21 {
	
 public static void main(String[] args) {

	 ListNode n31= new ListNode(4,null);
	 ListNode n21= new ListNode(2,n31);
	 ListNode l1= new ListNode(1,n21);
	 
	 ListNode n32= new ListNode(4,null);
	 ListNode n22= new ListNode(3,n32);
	 ListNode l2= new ListNode(1,n22);
	 
	 ListNode temp=mergeTwoLists(l1,l2);
	 System.out.print("[");
	 while(temp!=null) {
		 System.out.print(temp.val+", ");
		 temp=temp.next;
	 }
	 System.out.print("]");
}

		
	
public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // Create dummy list node of value 0    
	ListNode dummy = new ListNode(0);
	//Assign the dummy node to new node of named tail
    ListNode tail = dummy;
    
    //Loop till list1 become nulls or List 2 becoms null
    //List1 and and list 2 are nodes
    
    while(list1 != null && list2 != null) {
        if(list1.val <= list2.val) {
            tail.next = list1;
            list1 = list1.next;
        }else {
            tail.next = list2;
            list2 = list2.next;
        }
        tail = tail.next;
    }
    if(list1 == null) {
        tail.next = list2;
    }else {
        tail.next = list1;
    }
    return dummy.next;
	

    }

}
