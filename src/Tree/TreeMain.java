package Tree;
public class TreeMain {
	
	public static void main(String args[])    
	{    
	    TreeTraversal pt = new TreeTraversal();    
	    pt.root = new TreeTraversal(36);    
	    pt.root.left = new TreeTraversal(26);    
	    pt.root.right = new TreeTraversal(46);    
	    pt.root.left.left = new TreeTraversal(21);    
	    pt.root.left.right = new TreeTraversal(31);    
	    pt.root.left.left.left = new TreeTraversal(11);    
	    pt.root.left.left.right = new TreeTraversal(24);    
	    pt.root.right.left = new TreeTraversal(41);    
	    pt.root.right.right = new TreeTraversal(56);    
	    pt.root.right.right.left = new TreeTraversal(51);    
	    pt.root.right.right.right = new TreeTraversal(66);    

	    System.out.println();   
	    System.out.println("The Preorder traversal of given binary tree is - ");    
	    pt.traversePreorder();    
	    System.out.println("\n");    
	    System.out.println("The Inorder traversal of given binary tree is - ");    
	    pt.traversePreorder();    
	    System.out.println("\n");    
	    System.out.println("The Postorder traversal of given binary tree is - ");    
	    pt.traversePreorder();    
	    System.out.println();    
	}    
		
		
		
		
		
		

	}


