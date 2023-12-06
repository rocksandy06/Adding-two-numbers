package Class_Program_3;

public class LinkedMain {

	public static void main(String[] args) {
		SingleLinkedList arr=new SingleLinkedList();
    	arr.addNode(6);
    	arr.addNode(8);
        arr.addNode(12);
        arr.addNode(27);
        arr.addNode(43);
    	
    	arr.display();
    	
		System.out.println("The length of the linked list is: "+arr.length());
		
		
		DoubleLinkedList arr1=new DoubleLinkedList();
    	arr1.addNode(6);
    	arr1.addNode(8);
        arr1.addNode(12);
        arr1.addNode(27);
        arr1.addNode(43);
    	
    	arr1.display();
    	
		System.out.println("The length of the linked list is: "+arr1.length());
		
		CircularLinkedList arr2=new CircularLinkedList();
    	arr2.addNode(6);
    	arr2.addNode(8);
        arr2.addNode(12);
        arr2.addNode(27);
        arr2.addNode(43);
    	
    	arr2.display();
    	
		System.out.println("The length of the linked list is: "+arr2.length());
	}

}
