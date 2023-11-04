package Class_Program_2;

import java.util.Scanner;

public class Palidromeornot_Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int rem,sum=0,temp;
		temp=n;
		while(n>0)
		{
		rem=n%10;
	
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(temp==sum)
			System.out.println("Palidrome Number");
		else {
			System.out.println("Not a Palidrome Number");
			
		}
		}
		

	}


