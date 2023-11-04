package Class_Program;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int result=0;
		for(int i=1; i<=n; i++)
		{
			result+=result+i;
		}
		System.out.println("Sum="+result);
		S.close();

	}

}
