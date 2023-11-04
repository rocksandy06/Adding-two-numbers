package Class_Program;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int result=1;
		for(int i=n; i>=1; i--)
		{
			result=result*i;
		}
		System.out.println("Sum="+result);
		S.close();

	

	}

}
