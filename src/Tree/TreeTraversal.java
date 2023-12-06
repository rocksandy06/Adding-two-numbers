package Tree;

import Class_Program_3.TreeNode;

public class TreeTraversal {
	 private TreeNode root;

	public static void main(String[] args) {
	        TreeTraversal tree = new TreeTraversal();

	        // create a sample tree
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	        tree.root.left.right = new TreeNode(5);

	        // perform Inorder traversal
	        System.out.print("Inorder traversal: ");
	        tree.inorderTraversal(tree.root);
	        System.out.println();

	        // perform Preorder traversal
	        System.out.print("Preorder traversal: ");
	        tree.preorderTraversal(tree.root);
	        System.out.println();

	        // perform Postorder traversal
	        System.out.print("Postorder traversal: ");
	        tree.postorderTraversal(tree.root);
	        System.out.println();
	    }

	private void preorderTraversal(TreeNode root2) {
		// TODO Auto-generated method stub
		
	}

	private void postorderTraversal(TreeNode root2) {
		// TODO Auto-generated method stub
		
	}

	private void inorderTraversal(TreeNode root2) {
		// TODO Auto-generated method stub
		
	}
	}

