package Class_objects;

public class Sum3 {
	int emp_id;
	String emp_name;
	double salary;
	void setemp() {
		emp_id=25;
		emp_name="Santhosh Kumar";
		salary=20000;
	}
	void getemp() {
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String[] args) {
		Sum3 ob=new Sum3();
		System.out.println("state emp_id: "+ob.emp_id);
		System.out.println("getter method calling");
		ob.getemp();
		System.out.println("setter method calling");
		ob.setemp();
		System.out.println("Calling get method after set method: ");
		ob.getemp();
		
		

	}

}
