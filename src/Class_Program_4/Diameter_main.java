package Class_Program_4;

public class Diameter_main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Diameter(9);
        tree.root.left = new Diameter(7);
        tree.root.right = new Diameter(8);
        tree.root.left.left = new Diameter(6);
        tree.root.left.right = new Diameter(22);
        tree.root.left.left.right=new Diameter(22);
        tree.root.left.left.right.left=new Diameter(13);
        tree.root.left.left.right.right=new Diameter(4);
        tree.root.left.left.right.right.left=new Diameter(2);
        tree.root.right.left=new Diameter(11);
        tree.root.right.right=new Diameter(13);
        tree.root.right.right.left=new Diameter(16);
        tree.root.right.right.right=new Diameter(9);
        tree.root.right.right.left.left=new Diameter(3);
        tree.root.right.right.left.right=new Diameter(20);
        tree.root.right.right.left.right.left=new Diameter(19);
        
        
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preorderTraversal(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal(tree.root);

        System.out.println("\nThe diameter of the binary tree is: " + tree.diameter());
        
	}

}
