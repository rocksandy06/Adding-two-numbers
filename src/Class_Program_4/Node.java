package Class_Program_4;



public class Node {
	int key;
	  Node left, right;
	public String data;
	  
	  public Node(int item) {
		  key = item;
		  left = right = null;
		  }
	  class BinaryTree {
		  Node root;
		  public void traverseTree(Node node) {
			    if (node != null) {
			      traverseTree(node.left);
			      System.out.print(" " + node.key);
			      traverseTree(node.right);
			    }
			    }
			    public static void main(String[] args) {

			        
			  
					BinaryTree bt = new BinaryTree();

			        
			       
					bt.root = new Node(1);
			        bt.root.left = new Node(2);
			        bt.root.right = new Node(3);
			        bt.root.left.left = new Node(4);

			        System.out.print("\nBinary Tree: ");
			        bt.traverseTree(bt.root);	    
			    }
				
				
			    }
			    
	

}
