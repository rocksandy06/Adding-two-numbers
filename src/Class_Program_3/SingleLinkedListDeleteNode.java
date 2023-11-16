package Class_Program_3;

import java.util.LinkedList;



public class SingleLinkedListDeleteNode {

	
		
		class node { 
			node head1; 

			
			class Node { 
				int data;
				node next;
				
				public void node(int data) {
					this.data=data;
					this.next=null;
				}
				
			}
			public node head=null;
			public node tail=null;
			private int data;
			private node next;

			
			
			void deleteNode(int key) 
			{ 
				
				node temp = head1;
				node prev = null; 

				
				if (temp != null && temp.data == key) { 
					head1 = temp.next; 
					return; 
				} 

				
				while (temp != null && temp.data != key) { 
					prev = temp; 
					temp = temp.next; 
				} 

				
				if (temp == null) 
					return; 

				
				prev.next = temp.next; 
			} 
			

			
			public void display() {
				node current=head1;
				if(head1==null) {
					System.out.println("List is empty");
					return;
				}
				System.out.println("Nodes of Singly linked list: ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
				System.out.println();
			}
			
			public static void main(String[] args) 
			{
				SingleLinkedList arr = new SingleLinkedList(); 

				arr.addNode(6);
		    	arr.addNode(8);
		        arr.addNode(12);
		        arr.addNode(27);
		        arr.addNode(43);
		    	
		    	arr.display();
				

		/*		System.out.println("Created Linked list is:"); 
				arr.printNode(); 

				arr.deleteNode(1); 

				System.out.println("Linked List after Deletion of 1:"); 
				arr.printNode(); */
			} 
		}


	

}
