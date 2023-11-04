package Class_Program;

import java.util.Scanner;

public class Sum19 {

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
		System.out.printf("%d %c %d = %.2f/n",first,ch,second,result);
		System.out.println(first+" "+ch+" "+second+" = "+result);
		s.close();
		

	}

}
