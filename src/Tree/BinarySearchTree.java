package Tree;

public class BinarySearchTree {
	
	


	private Object root;

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);

		
		int key = 60;

		
		if (tree.search(tree.root, key) == null)
			System.out.println(key + " not found");
		else
			System.out.println(key + " found");
		
        
	
	

	}

	private Object search(Object root2, int key) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object insert(Object root2, int i) {
		return i;
		// TODO Auto-generated method stub
		
	}


	
}
