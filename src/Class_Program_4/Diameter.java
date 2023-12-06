package Class_Program_4;

public class Diameter {
        int data;
        Diameter left;
        Diameter right;
	    
	    public Diameter(int data) {
	        this.data = data;
	    }
	}

	class BinaryTree {
		
		
		Diameter root;

		    public BinaryTree() {
		        root = null;
		    }

		    
		    void inorderTraversal(Diameter node) {
		        if (node == null)
		            return;

		        inorderTraversal(node.left);
		        System.out.print(node.data + " ");
		        inorderTraversal(node.right);
		    }

		   
		    void preorderTraversal(Diameter node) {
		        if (node == null)
		            return;

		        System.out.print(node.data + " ");
		        preorderTraversal(node.left);
		        preorderTraversal(node.right);
		    }

		    
		    void postorderTraversal(Diameter node) {
		        if (node == null)
		            return;

		        postorderTraversal(node.left);
		        postorderTraversal(node.right);
		        System.out.print(node.data + " ");
		    }

		public int diameter() {	
	        return diameterHelper(root);
	    }
	    
	    private int diameterHelper(Diameter root2) {
	        
	        if (root2 == null) {
	            return 0;
	        }
	       
	        int leftHeight = height(root2.left);
	        int rightHeight = height(root2.right);
	        int leftDiameter = diameterHelper(root2.left);
	        int rightDiameter = diameterHelper(root2.right);
	        return Math.max(leftHeight + rightHeight +1, Math.max(leftDiameter, rightDiameter));
	    }
	    
	    private int height(Diameter node) {
	        
	        if (node == null) {
	            return 0;
	        }
	        int leftHeight = height(node.left);
	        int rightHeight = height(node.right);
	        return Math.max(leftHeight, rightHeight)+1;
	    }
		}
	

	
