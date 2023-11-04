package Class_Program;

import java.util.Scanner;
public class Sum11array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]arr= {18,23,56,45,89};
		
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(i+": "+arr[i]);
			
			for(int j=i+1 ;j<arr.length;j++) {
			System.out.println(j+": "+arr[j]);
				
				if(arr[i]>arr[j]) {
					
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				System.out.println(temp );
				
			}
		s.close();
			}
		}
	}
}

	


