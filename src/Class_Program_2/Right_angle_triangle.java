package Class_Program_2;

import java.util.Scanner;

public class Right_angle_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			String str=s.nextLine();
			String str1[]=str.split(" ");
			int a =Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[1]);
			int c = Integer.parseInt(str1[2]);
			 
			if(a<=100000 && b<=100000 && c<=10000) {	
			 if(c*c==a*a+b*b) {
				System.out.println("yes");
			 }
			 else
				System.out.println("no");
			 s.close();

	}
	}
}
