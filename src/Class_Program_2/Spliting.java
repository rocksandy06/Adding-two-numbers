package Class_Program_2;

import java.util.Scanner;

public class Spliting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		int a=Integer.parseInt(str1[0]);
		int b=Integer.parseInt(str1[1]);
		if(a>=1&&a<=5&&b>=1&&b<=50)
		System.out.println((int)Math.pow(a, b) );
		s.close();
		
		
		
		

	}

}
