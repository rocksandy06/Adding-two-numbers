package BinarySearchTree;

public class BST {
	BSTNode root;
	boolean isAvailable=false;
	
	public BSTNode insert(int value) {
		return insert(root, value);
		
	}
	public BSTNode insert(BSTNode node,int value) {
		if(node==null) {
			node=new BSTNode(value);
			return root;
			}
		if (value<node.getData()) {
			node.setLeft(insert(node.getLeft(), value));
		}else {
			node.setRight(insert(node.getRight(), value));
		}
		return node;
	}
	public BSTNode search(int value) {
		isAvailable=false;
		return search(value,root);
		
	}
	public BSTNode search(int value,BSTNode currentRoot) {
		if(currentRoot!=null&&currentRoot.getData()==value) {
			isAvailable=true;
			return currentRoot;
		}
		else if(currentRoot!=null&&currentRoot.getData()> value)
		{
			return search(value, currentRoot.getLeft());
		}
		else if(currentRoot!=null&&currentRoot.getData() <value){
			return search(value, currentRoot.getRight());
		}
	
	return currentRoot;
}
	
}
	


