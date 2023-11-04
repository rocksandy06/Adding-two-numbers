package Class_Program;

import java.util.Scanner;

public class Alphabet_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		int a=65;
		for(int i=1;i<=n;i++) {
			for (int space=n;space>i;space--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print((char)a + " ");
				a++;
		}
		System.out.println();
		}
		s.close();

	}

}
