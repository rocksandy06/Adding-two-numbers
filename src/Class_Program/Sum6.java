package Class_Program;

import java.util.Scanner;

public class Sum6 {

	public static void main(String[] args) {
		Scanner S =new Scanner(System.in);
		char ch =S.next().charAt(0);
		switch (ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a Vowel");
		}
			
				
		
		
		
		
			
			
		

	}

}
