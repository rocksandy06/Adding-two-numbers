package Class_Program_3;



public class DoubleLinkedList {
		class node{
			int data;
			node next;
			node Previous;
			
			public node(int data) {
				this.data=data;
				
			}
			
		}
		public node head=null;
		public node tail=null;

		public void addNode(int data) {
			node newNode=new node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
				head.Previous=null;
				tail.next=null;
			}
			else {
				tail.next=newNode;
				newNode.Previous = null;
				tail=newNode;
				tail.next=null;
				
				
			}
		}
		
		public void addFirst(int data)
		{
			
			node newHead=new node(data);
			if(head==null) {
				newHead.next=null;
			}
			else {
				head.Previous=null;
				newHead.next=head;
			}
			
			head.Previous=null;
			
		}

		public void display() {
			node current=head;
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			System.out.println("Nodes of doubly linked list: ");
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			}
			
		}
	
	}

	


