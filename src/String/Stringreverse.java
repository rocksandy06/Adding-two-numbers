package String;

public class Stringreverse {

	public static void main(String[]args) {
		String string="abcdef 1234";
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: "+string);
		System.out.println("\n String after reverse: "+reverse);
		String input="abcdef";
		char[] n=input.toCharArray();
		for(int i= n.length-1;i>=0;i--) {
			System.out.print(n[i]);
		}
	    System.out.println();
	    String text="The Cat is on the table";
	    System.out.print(text.contains("the"));
	    
				
			
		}
		
		
		

	}

}
