package Class_Program;

public class Sum10 {

	public static void main(String[] args) {
		int[]numbers = {10,20,30,40,50};
		String Str2[] = {"one","two","three"};
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\nFor each loop");
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println("\nString Array: ");
		for(int i=0;i<Str2.length;i++) {
			System.out.print(Str2[i]+" ");
		}
		System.out.println("\nFor each loop-string array");
		for(String num:Str2) {
			System.out.print(num+" ");
		}
		
		
		

	}

}
