package Tree;

public class TreeTraversal{
	public int value;
	public TreeTraversal left,right;
	public TreeTraversal root;
	public TreeTraversal(int i, Object data) {
		this.left=null;
		this.right=null;
	}


	public void TreeTraversal1(int i, Object data) {
		
	}
		


	public TreeTraversal(Object data) {
	}


	public TreeTraversal() {
		// TODO Auto-generated constructor stub
	}


	public void TreeTraversal1(Object data) {
	}


	public void Node (int element) {
		value=element;
		left=right=null;
	}



	
}
class Order{
	TreeTraversal root;
	void Tree(){
		root=null;
	}
	void transversePreorder(TreeTraversal node) {
		if(node==null)
			return;
		System.out.println(node.value+" ");
		transversePreorder(node.left);
		transversePreorder(node.right);
	}
	void transverseInorder(TreeTraversal node) {
		if(node==null) 
			return;
		traverseInorder(node.left);
		System.out.println(node.value+" ");
		traverseInorder(node.right);
	}
	void traversePostorder(TreeTraversal node) {
		if(node==null)
			return;
		traversePostorder(node.left);
		traversePostorder(node.right);
		System.out.println(node.value+" ");
	}
	void traversePreorder(TreeTraversal root2) {
		traversePreorder(root);
	}
	void traverseInorder(TreeTraversal left) {
		traverseInorder(root);
	}
	void traversePostorder() {
		traversePostorder(root);
	}
	



}    


		
		
