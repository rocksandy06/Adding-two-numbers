package Class_Program_3;

import Class_Program_3.DoubleLinkedList.node;

public class CircularLinkedList {

	
		
			
			int data;
			node next;
			
			public void node(int data) {
				this.data=data;
				
			}
			
		
		public node head=null;
		public node tail=null;

		public void add(int data){
			
			Class_Program_3.DoubleLinkedList.node newNode = null;
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
		public int length(node head2) {
			if(head2==null) {
				System.out.println("RETURN 0");
			
			return 0;
			}
			System.out.println(head2.data+":FUNCTION CALL");
			int len=length(head2.next);
			len=len+1;
			System.out.println(head2.data+":"+len);
			return len;
		}
		public int length1() {
			return length(head);
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

		public void addNode(int i) {
			// TODO Auto-generated method stub
			
		}

		public String length() {
			// TODO Auto-generated method stub
			return null;
		}
}
		
	
		
	 

			
		


	
		
		

	


