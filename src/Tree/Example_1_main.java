package Tree;

public class Example_1_main {

	public static void main(String[] args) {
		Node root = new Node(21); 
		root.left = new Node(9); 
		root.right = new Node(6); 
		root.left.left = new Node(23); 
		root.left.right=new Node(18);
		root.left.left.left=new Node(19);
		root.left.left.right=new Node(13);
		root.right.left=new Node(7);
		root.right.right=new Node(16);
		root.right.left.left=new Node(17);
		root.right.right.left=new Node(15);
		root.right.right.left.left=new Node(11);
		
		
		if (checkDup(root)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	}

	private static boolean checkDup(Node root) {
		// TODO Auto-generated method stub
		return false;
	}
}


class Node { 
	public static final String value = null;
	int data; 
	Node left,right; 
	Node(int data)
	{
		this.data=data;
	}
	

	}


