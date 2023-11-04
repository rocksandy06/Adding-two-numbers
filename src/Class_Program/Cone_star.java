package Class_Program;

import java.util.Scanner;

public class Cone_star {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				if(i==1 || j==1 || j==n || j==i)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=n;j>=i;j--) 
			{
				if(i==1 || j==1 || j==n || j==i)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();

	}

}
