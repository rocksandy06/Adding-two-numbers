package String;

public class Character_Method {

	public static void main(String[] args) { 
		

		Scanner s=new Scanner(System.in);

		String str=s.next();

		int letter=0,digit=0,vowel=0,consonent=0,special=0;

		char ch[]=str.toCharArray();

		

		for(int i=0;i<ch.length;i++)

		{

			

			if(Character.isLetter(ch(i)))

			{

			letter++;

			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'

					||ch[i]=='A'||ch[i]=='E'||ch[i]=='O'||ch[i]=='U'||ch[i]=='I')

				vowel++;

			else

			{

				consonent++;

			}

			}

			else if(Character.isDigit(ch[i]))

			{

			digit++;

			}

			

			else

			{

				special++;

			}

			

		}

		System.out.println("Alphabets: "+letter);

		System.out.println("Digits: "+digit);

		System.out.println("Vowel: "+vowel);

		System.out.println("Consonent: "+consonent);

		System.out.println("Special: "+special);
	}

	
	
}
