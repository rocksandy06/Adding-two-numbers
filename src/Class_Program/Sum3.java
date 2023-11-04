package Class_Program;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int rem,sum1=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum1 +=rem;
		}
		System.out.println(sum1);
		S.close();
					
		
			

	}

}
