package Class_Program;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		char ch=S.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'
				||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
			System.out.println("The given word is Vowel");
		}
		else {
			System.out.println("The given Word is Not Vowel");
		}
		S.close();
			
		



	}

}
