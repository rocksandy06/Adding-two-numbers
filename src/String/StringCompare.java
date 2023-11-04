package String;

public class StringCompare {

	public static void main(String[] args) {
		String strOrig="Hello World,Hello Reader";
		int lastIndex=strOrig.lastIndexOf("ds");
		if(lastIndex==-1)
		{
			System.out.println("Hello not found");
		}
		else
		{
			System.out.println("Last occurence of Hello is at index:  " +lastIndex);
		}
		
	    

	}

}
