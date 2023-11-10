package Class_Program_3;

import java.util.LinkedList;

import org.w3c.dom.Node;



public class SingleLinkedList {
	class node{
		int data;
		node next;
		
		public node(int data) {
			this.data=data;
			this.next=null;
		}
		
	}
	public node head=null;
	public node tail=null;

	public void addNode(int data) {
		node newNode=new node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		node current=head;
		if(head==null) {
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
	
    public static void main(String[] args) {
    	SingleLinkedList arr=new SingleLinkedList();
    	arr.addNode(6);
    	arr.addNode(8);
        arr.addNode(12);
        arr.addNode(27);
        arr.addNode(43);
    	
    	arr.display();
		

		
	}

}
