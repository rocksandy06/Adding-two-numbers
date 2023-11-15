package Class_Program_3;

import Class_Program_3.SingleLinkedList.node;

public class CircularLinkedList {

	
		class node{
			int data;
			node next;
			
			public node(int data) {
				this.data=data;
				
			}
			
		}
		public node head=null;
		public node tail=null;

		public void add(int data){
			
			node newNode=new node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
				newNode.next=head;
			}
			else {
				tail.next=newNode;
				tail=newNode;
				tail.next=head;
			}
		}
		
		public void display() {
			node current=head;
			if(head==null) {
				System.out.println("List is empty");
				
			}
			else {
				
			
			System.out.println("Nodes of Circular linked list: ");
			do {
				
			
				System.out.print(" "+current.data);
				current=current.next;
			}while(current!=head);
			System.out.println();
			}
		}
}
		
	
		
	 

			
		


	
		
		

	


