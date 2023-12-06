package Tree;

public class Value_Main {

	public static void main(String[] args) {
		ActiveValue value=new ActiveValue();
		value.root=new ActiveValue(21);
		value.root.left=new ActiveValue(9);
		
		value.root.left.left=new ActiveValue(23);
		value.root.left.right=new ActiveValue(18);
		value.root.left.left.left=new ActiveValue(12);
		value.root.left.left.right=new ActiveValue(13);
		value.root.right=new ActiveValue(6);
		value.root.right.left=new ActiveValue(7);
		value.root.right.right=new ActiveValue(16);
		value.root.right.left.left=new ActiveValue(17);
		value.root.right.right.left=new ActiveValue(15);
		value.root.right.right.left.left=new ActiveValue(11);
		
	}
		
		
	int key = 4; 
	 
    if (void ifNodeExists(value root, key){ 
        return false;
    }
    else {
       return true;
    }
}
		
			
		
		
		
		
		/*System.out.print("ActiveValueinorderTraversal: ");
		value.ActiveValueinorderTraversal();
		System.out.println();
		
		System.out.print("ActiveValuepreorderTraversal: ");
		value.ActiveValuepreorderTraversal();
		System.out.println();
		
		System.out.print("ActiveValuepostorderTraversal: ");
		value.ActiveValuepostorderTraversal();
		System.out.println();*/
		
		
		
		

	}

}
