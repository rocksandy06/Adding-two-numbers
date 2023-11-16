package Queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;


public class Queue_Example{
	
	public static void main(String[]args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Queue<Integer> queue1=new LinkedList<Integer>();
		System.out.println("is empty value: "+queue.isEmpty());
		queue.add(76);
		queue.offer(10);
		queue.offer(35);
		queue.offer(22);
		queue.offer(54);
		queue.offer(63);
		System.out.println(queue);
		
		queue.size();
		System.out.println("updated queue size: "+queue.size());
		
		queue.poll();
		System.out.println(queue);
		System.out.println("peek:"+queue.peek());
		
		
		System.out.println("updated: "+queue);
		
		queue.isEmpty();
		System.out.println("is empty value: "+queue.isEmpty());
		
		
		queue1.offer(12);
		queue1.offer(13);
		queue1.offer(34);
		queue1.offer(98);
		queue1.offer(44);
		System.out.println(queue1);
		//System.out.println("is empty value:"+queue1);
		
		queue.poll();
		System.out.println("peek:"+queue1.peek());
	
        boolean a=queue.addAll(queue1);
		System.out.println("queue1 is:"+a);
		
		System.out.println(queue);
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

