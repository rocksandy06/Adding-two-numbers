package Class_Program_2;

import java.util.Scanner;

public class TestCsae_oddeven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st no.: ");
		int n=s.nextInt();
		System.out.println("Enter the 2nd no.: ");
		int c=s.nextInt();
		int sum=n+c;
		if(sum%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		
		

	}

}
