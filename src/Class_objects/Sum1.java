package Class_objects;

import java.util.Scanner;

public class Sum1 {
	
	
	int stud_id;
	String stud_name;
	
	void print(int id1,String name1) {
		stud_id=id1;
		stud_name=name1;
		System.out.println("Student id: "+stud_id);
		System.out.println("Student Name: "+stud_name);
	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Student id: ");
		int id=s.nextInt();
		System.out.println("Enter the Student Name: ");
		String name=s.next();
		Sum1 obj=new Sum1();
		obj.print(id,name);
		s.close();
		

	}

}
