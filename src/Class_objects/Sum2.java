package Class_objects;

public class Sum2 {
	int x;//class variable or global variable.
	void local_var() {
	 
		int a=2;//local variable 
		
		a=a+7;
		System.out.println("a= "+a);
	}
	void print() {
		//System.out.println("a= "+a);//only visible inside the block becoz it is local variable
		System.out.println("x= "+x);
	}

	public static void main(String[] args) {
		Sum2 s =new Sum2();
		s.local_var();
		System.out.println("x = "+s.x);
		
	}

}


	
