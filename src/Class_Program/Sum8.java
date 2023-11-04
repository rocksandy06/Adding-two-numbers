package Class_Program;

import java.util.Scanner;

public class Sum8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,Gsalary,Nsalary;
		String name,address,contact;
		id=s.nextInt();
		name=s.next();
		s.nextLine();
		address=s.nextLine();
        contact=s.next();
        Gsalary=s.nextInt();
        if(Gsalary<=20000)
        	Nsalary =Gsalary+5000;
        else if(Gsalary<=30000)
        	Nsalary=Gsalary+7000;
        else if(Gsalary<=40000)
        	Nsalary =Gsalary+8000;
        else 
        	Nsalary =Gsalary+10000;
        System.out.println("Employee id: " +id);
        System.out.println("Employee Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contact);
        System.out.println("Net Salary: "+Nsalary);
        
        
        
		
		
		
			

	}

}
