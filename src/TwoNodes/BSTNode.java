package TwoNodes;


public class BSTNode {
	
		
		int data;
		BSTNode left;
		BSTNode right;

		public BSTNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	

	public int findDistance1(BSTNode root, int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcaData = findLCA(root, n1, n2).data;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
		
	}
	
	


	public int Pathlength(BSTNode root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {
				 System.out.println(root.data);
				return x + 1;
			}
			return 0;
		}
		return 0;
		}
		public BSTNode findLCA(BSTNode root, int n1, int n2) {
			if (root != null) {
				if (root.data == n1 || root.data == n2) {
					return root;
				}
				BSTNode left = findLCA(root.left, n1, n2);
				BSTNode right = findLCA(root.right, n1, n2);

				if (left != null && right != null) {
					return root;
				}
				if (left != null) {
					return left;
				}
				if (right != null) {
					return right;
				}
			}
			return null;
		}


		
}
	
