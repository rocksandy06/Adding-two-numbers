package Class_Program;

import java.util.Scanner;

public class Sum25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
				for(int j=n;j>=i;j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
			s.close();

	}

}
