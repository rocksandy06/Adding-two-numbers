package BinarySearchTree;

public class BSTMain {

	public static void main(String[] args) {
		BSTNode bst=new BSTNode(22);
		BST binarySearchTree=new BST();
		binarySearchTree.insert(19);
		binarySearchTree.insert(15);
		binarySearchTree.insert(25);
		binarySearchTree.insert(39);
		binarySearchTree.insert(17);
		binarySearchTree.insert(14);
		binarySearchTree.insert(21);
		binarySearchTree.insert(24);
		int searchVal1=21;
		int searchVal2=19;
		int searchVal3=18;
		int searchVal4=24;
		binarySearchTree.search(searchVal1);
		System.out.println(searchVal1+" : "+binarySearchTree.isAvailable);
		binarySearchTree.search(searchVal2);
		System.out.println(searchVal2+" : "+binarySearchTree.isAvailable);
		binarySearchTree.search(searchVal3);
		System.out.println(searchVal3+" : "+binarySearchTree.isAvailable);
		binarySearchTree.search(searchVal4);
		System.out.println(searchVal4+" : "+binarySearchTree.isAvailable);

	}

}
