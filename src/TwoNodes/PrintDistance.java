package TwoNodes;

public class PrintDistance {

	private static final int BSTNode = 0;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BSTNode root = new BSTNode(5);
		root.left=new BSTNode(3);
		root.right=new BSTNode(6);
		root.left.left=new BSTNode(1);
		root.left.right=new BSTNode(2);
		root.right.left=new BSTNode(8);
		root.right.right=new BSTNode(10);
		
		PrintDistance i1 = new PrintDistance();
		i1.finddistance(1);
		i1.finddistance(99);
		i1.finddistance(63);
		i1.finddistance(39);
		
		int n1=3;
		int n2=10;
		Object distance =findDistance(root, n1, n2);

        if (BSTNode != -1) {
            System.out.println("Node " + n1 + " and " + n2 + " is " +findDistance(root, n1,n2));
        } else {
            System.out.println("Node " + n1 + " and " + n2 + " are not present in the BST");
        }
		
		
	}
		
	public void finddistance(int i) {
		// TODO Auto-generated method stub
		
	}

	public static  Object findDistance(BSTNode root, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
