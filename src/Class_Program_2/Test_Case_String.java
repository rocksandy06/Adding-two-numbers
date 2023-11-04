package Class_Program_2;

import java.util.Scanner;

public class Test_Case_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=s.next();
		char ch[]=str1.toCharArray();
		int len=str1.length();
		
		if(len%2==0) {
			for(int i=1;i<len;i+=2) {
				System.out.print(ch[i]+""+ch[i-1]);
			}
		}
			else {
				for(int i=1;i<len-1;i+=2)
					System.out.print(ch[i]+""+ch[i-1]);
				System.out.print(ch[len-1]);
			}
		
	}
}
			
		
		

	


