package Class_Program_3;

public class TreeNode {
	
	    int data;
	    TreeNode left;
	    TreeNode right;

	    public TreeNode(int data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}

	class LinkedListNode {
	    int data;
	    LinkedListNode left;
	    LinkedListNode right;

	    public LinkedListNode(int data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}

	class LinkedListTree1 {
	    public static void main(String[] args) {
	        LinkedListNode obj = new LinkedListNode(10);
	        obj.right = new LinkedListNode(20);
	        obj.right.right = new LinkedListNode(30);
	        obj.right.left = new LinkedListNode(40);
	        obj.right.right.left = new LinkedListNode(50);
	        obj.right.right.right = new LinkedListNode(60);
	        disp(obj);
	    }

	    public static void disp(LinkedListNode head) {
	        LinkedListNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.right;
	        }
	    }
	}

