package DoublySorted;

public class Node {
	
	    int data;
	    Node previous;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        previous =next= null;
	       
	    }
	}

	class DoublyLinkedList 
	{
	    Node head;

	    public void insert(int data) 
	    {
	        Node newNode = new Node(data);
	        if (head == null) 
	        {
	            head = newNode;
	        } 
	        else 
	        {
	            Node current = head;
	            while (current.next != null)
	            {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.previous = current;
	        }
	    }

	    public void printList() 
	    {
	        Node current = head;
	        System.out.print("List: ");
	        while (current != null) 
	        {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void sortList() 
	    {
	        Node current = null, 
	        	index = null;
	        int temp;
	        if (head == null) 
	        {
	            return;
	        } 
	        else {
	            for (current = head; 
	            		current.next != null; 
	            		current = current.next) 
	            {
	            	
	                for (index = current.next;
	                		index != null;
	                		index = index.next)
	                {
	                	
	                    if (current.data > index.data) 
	                    {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	                }
	            }
	        }
	    }
	}


