package Tree;




public class SearchNode {

	

	private Node root;

	public static void main(String[] args) {
		SearchNode tree=new SearchNode();
        tree.root=new Node(15);
        tree.root.left=new Node(9);
        tree.root.right=new Node(19);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(13);
        tree.root.right.left=new Node(17);
        tree.root.right.right=new Node(25);
        
        Node node=tree.searchNode(tree.root,17);   
        if(node!=null)
            System.out.println("Element "+Node.value+" is found in binary  tree");
         else 
            System.out.println("Element is not found in binary tree");

	}

	private Node searchNode(Node root2, int i) {
		// TODO Auto-generated method stub
		return null;
	}




}
