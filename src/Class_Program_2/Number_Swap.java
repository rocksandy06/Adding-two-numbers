package Class_Program_2;

import java.util.Scanner;

public class Number_Swap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("Number Swap: ");
		if(n%2==0) {
			for(int i=1;i<n;i+=2)
				System.out.print(arr[i]+" "+arr[i-1]+" ");
		}
		else {
			for(int i=1;i<n-1;i+=2)
				System.out.print(arr[i]+" "+arr[i-1]+" ");
			System.out.print(arr[n-1]);
		}
		s.close();
			
			
				
		

	}

}
