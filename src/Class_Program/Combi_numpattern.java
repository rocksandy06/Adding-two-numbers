package Class_Program;

import java.util.Scanner;

public class Combi_numpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
				System.out.print(j);
			System.out.println();
		}	
		for(int i=2;i<=n;i++) 
		{
			for(int j=n;j>=i;j--) 
				System.out.print(j);
			System.out.println();
		}
		s.close();


	}

}
