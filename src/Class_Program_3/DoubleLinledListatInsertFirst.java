package Class_Program_3;


public class DoubleLinledListatInsertFirst {
	
	public static void main(String[] args) {
		DoubleLinkedList dList=new DoubleLinkedList();
    	dList.addNode(8);
    	dList.addNode(25);
        dList.addNode(36);
        dList.addNode(15);
        dList.addNode(47);
        dList.addFirst(105);
    	
    	dList.display();
    	
    	CircularLinkedList cll = new CircularLinkedList();
    	cll.add(23);
    	cll.add(45);
    	
    	cll.display();
		

		
	
		
		

	}

}
