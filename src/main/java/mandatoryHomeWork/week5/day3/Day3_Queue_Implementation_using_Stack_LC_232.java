package mandatoryHomeWork.week5.day3;

import java.util.Stack;

public class Day3_Queue_Implementation_using_Stack_LC_232 {
	
	public static void main(String[] args) {
		MyQueue mq= new MyQueue();
		mq.push(1);
		mq.push(2);
		mq.push(3);
		mq.push(4);
	}

}
class MyQueue {

	Stack<Integer> s1= new Stack<>();
	Stack<Integer> s2= new Stack<>();
    public MyQueue() {
        
    }
    //Stack will follow LIFO order
    //But queue follow FIFO order
    // So for push operation we are emptying s1 and pushing all values to s2
    // Then insert our values to s1
    //then push the s2 values to s1
    public void push(int x) {
    	
    	while(!s1.isEmpty()) {
    		s2.push(s1.pop());
    	}
    	
    	s1.push(x);
    	
    	while(!s2.isEmpty()) {
    		s1.push(s2.pop());
    	}
    }
    
    public int pop() {
    	if(!s1.isEmpty()) {
    		return s1.pop();
    	}
    	return -1;
    }
    
    public int peek() {
    	if(!s1.isEmpty()) {
    		return s1.peek();
    	}
    	return -1;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}