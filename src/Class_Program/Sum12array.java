package Class_Program;

import java.util.Scanner;
public class Sum12array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements one by one: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Array elemnts are stored in memory: ");
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			
			}
			s.close();
			
		}
		
			

	}

}
