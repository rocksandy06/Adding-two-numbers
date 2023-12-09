package DoublySorted;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
        list.insert(20);
        list.insert(10);
        list.insert(40);
        list.insert(30);
        list.insert(25);

        System.out.println("Original list:");
        list.printList();

        list.sortList();

        System.out.println("Sorted list:");
        list.printList();
        
       
	}

}
