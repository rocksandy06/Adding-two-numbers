package Access_modifier.Sub_modifier;


public class p {
	private int a=10;//private method visible only inside the class.
	private int b=20;
	void display() {//default method it is visible to the whole package.
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	public class private_class{
		private int x=10;
		private int y=20;
	public static void main(String[] args) {
		p obj = new p();//trying to call the private variables outside the class which is not visible and not be accessed outside the class.
		private_class pc = new private_class();
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		
		obj.display();
		System.out.println("x="+pc.x);
		System.out.println("y="+pc.y);
	}


}


	}


