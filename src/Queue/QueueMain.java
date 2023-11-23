package Queue;

import java.util.Queue;




public class QueueMain {

	public static void main(String[] args) {
		QueueMain q= new QueueMain();
		
	    q.enQueue(10);
	    q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		Object queue =q.enQueue(5);
		System.out.println("Size of Queue:"+queue);
		
		System.out.print(q.displayQueue());
		
		
		
		

	}

	private boolean displayQueue() {
		return false;
		// TODO Auto-generated method stub
		
	}

	private Object enQueue(int i) {
		return i;
		// TODO Auto-generated method stub
		
	}

}
