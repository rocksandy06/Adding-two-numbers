package Tree;

public class BSTNode {
	class Node{
	    int value;
	    Node left,right;
		
	    Node(int i, int value)
	    {
	        this.value=value; 
	        left=null;
	        right=null;
	     }

		public Node(int i) {
			// TODO Auto-generated constructor stub
		}
		
		
	}
	class SearchNode
	{
	    Node root; 
	    SearchNode()
	    {
	        root=null;
	     }
	    public Node searchNode(Node root,int value)
	    {
	        if(root==null)
	            return null;
	        if(root.value==value)  
	            return root;
	        else if(value <root.value)  
	            return searchNode(root.left,value);  
	        else 
	            return searchNode(root.right,value); 
	    }
	    
	}
	
}
	