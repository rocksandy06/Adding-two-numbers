package Class_Program;

import java.util.Scanner;

public class Sum14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int first,second;
		double result=0;
		char ch;
		System.out.println("Enter the First number: ");
		first=s.nextInt();
		System.out.println("Enter the Second number: ");
		second=s.nextInt();
		System.out.println("Enter the operator(+,-,*,/): ");
		ch=s.next().charAt(0);
		switch(ch){
			case '+':
				result=first+second;
				break;
			case '-':
				 result=first-second;
				 break;
			case '*':
				result=first*second;
				break;
			case '/':
				result=first/second;
				break;
				default:
					System.out.println("Error!operator is not correct");
		}
		System.out.println("result= "+result);
		System.out.printf("format first = %f\n",result);
		System.out.printf("format with two decimal first = %.2f",result);
		
				
				
				
		
		

	}

}
