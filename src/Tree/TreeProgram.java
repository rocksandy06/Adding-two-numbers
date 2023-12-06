package Tree;

public class TreeProgram {
	class Node {    
	    public int value;    
	    public Node left, right;    
	    
	    public Node(int element)    
	    {    
	        value = element;    
	        left = right = null;    
	    }    
	}

	public Node root;    
	    
	class Tree {    
	    Node root;  /* root of the tree */  
	    
	    Tree() { root = null; }    
	  /*function to print the nodes of given binary in Preorder*/  
	    void traversePreorder(Node node)    
	    {    
	        if (node == null)    
	            return;    
	        System.out.print(node.value + " ");    
	        traversePreorder(node.left);    
	        traversePreorder(node.right);    
	    }    
	  /*function to print the nodes of given binary in Inorder*/  
	    void traverseInorder(Node node)    
	    {    
	        if (node == null)    
	            return;    
	        traverseInorder(node.left);    
	        System.out.print(node.value + " ");    
	        traverseInorder(node.right);    
	    }    
	    /*function to print the nodes of given binary in Postorder*/  
	    void traversePostorder(Node node)    
	    {    
	        if (node == null)    
	            return;    
	        traversePostorder(node.left);    
	        traversePostorder(node.right);    
	        System.out.print(node.value + " ");    
	    }    
	    
	  
	    void traversePreorder() { traversePreorder(root); }    
	    void traverseInorder() { traverseInorder(root); }    
	    void traversePostorder() { traversePostorder(root); }    
	    
	    public static void main(String args[])    
	    {    
	        TreeProgram pt = new TreeProgram();    
	        pt.root = new Node(38);    
	        pt.root.left = new Node(27);    
	        pt.root.right = new Node(25);    
	        pt.root.left.left = new Node(20);    
	        pt.root.left.right = new Node(18);    
	        pt.root.left.left.left = new Node(55);    
	        pt.root.left.left.right = new Node(24);    
	        pt.root.left.right.left=new Node(28);
	        pt.root.right.left = new Node(45);
	        pt.root.right.left.left=new Node(39);
	        pt.root.right.left.right=new Node(8);
	        pt.root.right.left.right.right=new Node(12);
	        pt.root.right.left.right.right.left=new Node(9);
	        pt.root.right.right = new Node(32);    
	        pt.root.right.right.left = new Node(13);    
	        pt.root.right.right.right = new Node(16);
	        pt.root.right.right.right.left=new Node(6);
	        pt.root.right.right.right.right=new Node(4);
	    
	        System.out.println();    
	        System.out.println("The Preorder traversal of given binary tree is - ");    
	        pt.traversePreorder();    
	        System.out.println("\n");    
	        System.out.println("The Inorder traversal of given binary tree is - ");    
	        pt.traverseInorder();    
	        System.out.println("\n");    
	        System.out.println("The Postorder traversal of given binary tree is - ");    
	        pt.traversePostorder();    
	        System.out.println();    
	    }    
	}

	public void traversePreorder() {
		// TODO Auto-generated method stub
		
	}

	public void traversePostorder() {
		// TODO Auto-generated method stub
		
	}

	public void traverseInorder() {
		// TODO Auto-generated method stub
		
	}    

}
