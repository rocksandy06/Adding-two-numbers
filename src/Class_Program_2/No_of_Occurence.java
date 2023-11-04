package Class_Program_2;

import java.util.Scanner;

public class No_of_Occurence {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements you want to array: ");
		int n=s.nextInt();
		int count=0;
		int arr[]=new int[n];
		System.out.println("Enter all the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the elements of which you want to " + "count number of occurences: ");
		int search=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==search)
				count++;
			}
		if(count>0)
			System.out.println("Number of occurence of the element: "+count);
		else
			System.out.println("Number of occurence of the element: "+count);

	}

}
