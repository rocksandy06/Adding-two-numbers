package Tree;

public class BinaryTree {
	 

	
	    
	    static class Node   
	    {  
	        Node left;  
	        Node right;  
	        int value;  
	        public Node(int value)   
	        {  
	            this.value = value;  
	        }  
	    } 
	    public static void main(String[] args)   {
	    	
	    
	        Node rootnode = new Node(15);  
	         
	      
	          
	        insert(rootnode, 12);  
	        insert(rootnode, 21);  
	        insert(rootnode, 23);  
	        insert(rootnode, 16);  
	        insert(rootnode, 10);
	        insert(rootnode, 13);
	    }  
	    public static void insert(Node node, int value)   
	    {  
	        if (value < node.value)   
	        {  
	            if (node.left != null)   
	            {  
	                insert(node.left, value);  
	            } else   
	            {  
	                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
	                node.left = new Node(value);  
	            }  
	        }   
	        else if (value > node.value)   
	        {  
	            if (node.right != null)   
	            {  
	                insert(node.right, value);  
	            } else   
	            {  
	                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
	                node.right = new Node(value);  
	            }  
	        }  
	    }  
	}  


