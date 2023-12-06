package Tree;

import java.util.HashSet;

import org.w3c.dom.Node;

public class Example_1 {
	
	

		
		public static boolean checkDupUtil(Node root, HashSet<Integer> s) 
		{ 
			
			if (root == null) 
				return false; 

			
			if (s.contains(root.data)) 
				return true; 

			
			s.add(root.data); 
		
			
			return checkDupUtil(root.left, s) || checkDupUtil(root.right, s); 
		} 

		
		public static boolean checkDup(Node root) 
		{ 
			HashSet<Integer> s=new HashSet<>();
			return checkDupUtil(root, s); 
		} 

		
			
	
	
	

	
	 
	}
	
	
	