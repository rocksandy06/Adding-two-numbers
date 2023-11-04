package Class_Program;

import java.util.Scanner;

public class Sum4 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			System.out.print(rem);
		}
		S.close();

	}

}
