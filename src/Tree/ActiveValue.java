package Tree;

public class ActiveValue {
	int data;
	ActiveValue left;
	ActiveValue right;
	public ActiveValue root;
	
	 
		
		
	

	
	
	public ActiveValue(int data) {
		this.data=data;
		left=right=null;
	
	}
		
		
	
	
	public ActiveValue() {
		// TODO Auto-generated constructor stub
	}




	public  boolean search(ClassValue root,int value) {
		if(root==null) {
			return true;
		}
		if(root==null) {
			return false;
		}
		else {
			return search(root.left, value) ||(root.right, value)
		}
	
		
		
	

/*
	public void ActiveValueinorderTraversal() {
		
		if(value==null)
			return;
		ActiveValueinorderTraversal(value.left);
		System.out.println(value.data +" ");
		ActiveValueinorderTraversal(value.right);
		
		
		
	}
	public void ActiveValuepreorderTraversal() {
		if(value==null)
			return;
		ActiveValuepreorderTraversal(value.left);
		System.out.println(value.data +" ");
		ActiveValuepreorderTraversal(value.right);
		
	}
	public void ActiveValuepostorderTraversal() {
		if(value==null)
			return;
		ActiveValuepostorderTraversal(value.left);
		System.out.println(value.data +" ");
		ActiveValuepostorderTraversal(value.right);
	}
	*/
		
		
	}



	
}
	
	

	
	


