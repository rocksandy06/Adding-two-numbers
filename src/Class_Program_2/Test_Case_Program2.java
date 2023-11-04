package Class_Program_2;

import java.util.Scanner;

public class Test_Case_Program2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,l,r;
		System.out.println("Enter the 1st no. : ");
		n=s.nextInt();
		System.out.println("Enter the 2nd no. : ");
		l=s.nextInt();
		System.out.println("Enter the 3rd no. : ");
		r=s.nextInt();
		if((n>=l)&&(n<=r)){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			
			
		
		
		

	}

}
