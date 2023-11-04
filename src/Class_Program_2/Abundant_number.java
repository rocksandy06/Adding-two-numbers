package Class_Program_2;

import java.util.Scanner;

public class Abundant_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum>n) {
			System.out.println(n+ " is an abundant number");
			
		}
		else 
			System.out.println(n+ "is not an abundant number");
		
		

	}

}
