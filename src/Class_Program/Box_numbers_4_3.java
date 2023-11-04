package Class_Program;

import java.util.Scanner;

public class Box_numbers_4_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n) 
					System.out.print("4");
				else 
					System.out.print("3");
			System.out.println();
			}
		}
		s.close();


	}

}
