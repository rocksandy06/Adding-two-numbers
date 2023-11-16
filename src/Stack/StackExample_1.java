package Stack;

import java.util.Stack;

public class StackExample_1 {

	public static void main(String[] args) {
		Stack<Integer>stack =new Stack<Integer>();
		System.out.println("Is empty check: "+stack.isEmpty());
		stack.add(56);
		stack.push(15);
		stack.push(22);
		stack.push(67);
		stack.push(76);
		
		System.out.println(stack);
		int last_removed_value=stack.pop();
		System.out.println("last_removed_value: "+last_removed_value);
		System.out.println("updated: "+stack);
		int last_removed_value_2=stack.remove(2);
		System.out.println("last_removed_value_2: "+last_removed_value_2);
		System.out.println("updated: "+stack);
		stack.firstElement();
		System.out.println("1 st element: "+stack.firstElement());
		System.out.println("Is empty check: "+stack.isEmpty());
		stack.clear();
		System.out.println("updated: "+stack);
		System.out.println("Is empty check: "+stack.isEmpty());
		
		
		
		
		
		
		
		
		
		
		

	}

}
