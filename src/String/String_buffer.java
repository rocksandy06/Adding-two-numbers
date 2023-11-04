package String;

public class String_buffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(20);
		StringBuffer s3=new StringBuffer("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("sdff af aaFA fsdfasdg 8034 ty 8035 rg sgasdg as agdg asdgoasdgasdg");
		System.out.println(s1.capacity());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		

	}

	private static Object reverse() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object capacity() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object length() {
		// TODO Auto-generated method stub
		return null;
	}

}
