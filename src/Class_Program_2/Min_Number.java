package Class_Program_2;

import java.util.Scanner;

public class Min_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=10;
		System.out.println("Enter the Numbers: ");
		int arr[]=new int[n];
		System.out.println();
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
			}
		}
		System.out.println(arr[n-1]);
		s.close();

	}

}
