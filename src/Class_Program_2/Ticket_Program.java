package Class_Program_2;

import java.util.Scanner;

public class Ticket_Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Ticket Number: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		for(int i=0;i<n;i++) {
		if(arr[i]%k==0) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
		}
		
			
			
			
					
		
		

	}

}
