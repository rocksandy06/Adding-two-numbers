package Tree;

import Tree.MirrorTree.Node;

public class MirrorMain {

	private static Object tree;

	public static void main(String[] args) {
		//Node Node = newNode();
		Node root = newNode(1); 
	    

		root.left = newNode(2); 
	    root.right = newNode(3); 
	    root.left.left =newNode(4); 
	    root.left.right = newNode(5); 
	    root.right.left =newNode(6);
	    root.right.right =newNode(7);

	  
	    System.out.print("Inorder traversal of original tree is \n");
	    inorder(root);

	    Node mirror = null;
	    mirror = mirror(root);
	   

	  
	    System.out.print("\nInorder traversal of the mirrored tree is \n");
	    inorder(mirror);

	}

	private static Node newNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Node mirror(Object root) {
		
		return null;
	}

	private static void inorder(Object root) {
		return;
		
	}

	

}
