package Class_Program;

import java.util.Scanner;

public class Sum24pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int space=n;space>i;space--) {
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			s.close();
					
				
				
			
		
		
	

	}

}
