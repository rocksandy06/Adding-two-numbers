package Class_Program_3;

import java.util.LinkedList;

import org.w3c.dom.Node;

import Class_Program_3.SingleLinkedList.node;



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
	public int length() {
		return length(head);
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
	
    
    	

		
	
	
	

}
