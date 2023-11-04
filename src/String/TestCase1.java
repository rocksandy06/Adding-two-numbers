package String;

import java.util.Scanner;

public class TestCase1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int digit=0,letter=0,vowel=0,consonant=0;
		//System.out.println("Enter the String: ");
		String str1=s.next();
		char ch[]=str1.toCharArray();
		for(int i=0;i<=ch.length;i++) {
			if(Character.isLetter(ch[i])) {
			letter++;
			
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
			vowel++;
		}
		else {
		  consonant++;
		
	
		
		else if(Character.isDigit(ch[i])) {
			digit++;
		}
	
	System.out.println("Alphabet :"+letter);
	System.out.println("Digits :"+ digit);
		

	

}}
