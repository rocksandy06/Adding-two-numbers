package String;

public class CharacterMethods {

	public static void main(String[] args) {
		System.out.println("5 is digit= "+Character.isDigit('5'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.toUpperCase('A'));
		String str1="hello";
		char ch[]=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		

	}

}
