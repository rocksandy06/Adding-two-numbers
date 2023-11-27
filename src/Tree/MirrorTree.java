package Tree;

public class MirrorTree {
	

		
		static class Node {
		    int data;
		    Node left;
		    Node right;
			
			
		}

		
		static Node newNode(int data) {
		    Node newNode = new Node();
		    newNode.data = data;
		    newNode.left = null;
		    newNode.right = null;
		    return newNode;
		}

		
		static void inorder(Node root) {
		    if (root == null)
		        return;
		    inorder(root.left);
		    System.out.print(root.data + " ");
		    inorder(root.right);
		}


		static Node mirror(Node root) {
		    if (root == null) {
		        return null;

		    }
		    
		    Node mirror = newNode(root.data);
		    mirror.right = mirror(root.left);
		    mirror.left = mirror(root.right);
		    return mirror;
		}
		
		

		    
		    }
		
	


