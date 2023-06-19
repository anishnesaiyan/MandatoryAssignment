package mandatoryHomeWork.week5.day4;

import java.util.LinkedList;
import java.util.Queue;

public class Day4_ImplementStackusingQueues_LC_225 {

}
class MyStack {

	Queue<Integer> q1;
	Queue<Integer> q2;

    public MyStack() {
       q1= new LinkedList<>();
       q2= new LinkedList<>();
    }
    
 // Add a new element by pushing it onto q2 and moving all elements from q1 to q2
    
    public void push(int x) {
        q2.add(x);
     // Add a new element by pushing it onto q2 and moving all elements from q1 to q2
        while(!q1.isEmpty()) {
        	q2.add(q1.remove());
        }
     //Move all elements from q2 back to q1 to maintain the order
        while(!q2.isEmpty()) {
        	q1.add(q2.remove());
        }
        
    }
    // Remove the last inputed element from q1
    public int pop() {
        return q1.remove();
    }
    
    //// Return the top element from q1 without removing it
    public int top() {
        
    	return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}