import java.io.*;
import java.util.*;

public class StackMain {
	static class Stack<T> {
		ArrayList<T> stackList;
		int head;
		
		Stack(){
			stackList = new ArrayList<>();
			head = -1;
		}
		
		public void push(T element) {
			stackList.add(element);
			head++;
		}
		
		public void pop () {
			T item = null;
			
				try {
					if(head < 0){
						throw new StackUnderflowException("Stack Underflow");
					}
					item = stackList.get(head);
					stackList.remove(head--);
				}
				catch (Exception e) {
					System.out.println(e);
				}
			
		}
		
		public T peek() {
			return stackList.get(head);
		}
		
		public void print(){
			System.out.println(stackList.toString());
		}
		
		
	}
	
	public static void main(String[] args) {
			System.out.println("Testing");
			
			Stack<Integer> stack = new Stack<>();
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			System.out.println(stack.peek());
			stack.pop();
			stack.pop();
			stack.pop();
			System.out.println(stack.peek());

	}
	
	
	
	
}

