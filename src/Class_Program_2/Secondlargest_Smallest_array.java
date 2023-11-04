package Class_Program_2;

import java.util.Scanner;

public class Secondlargest_Smallest_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array(Minimum2): ");
		int n=s.nextInt();
		System.out.println("Enter all the elements: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Second largest element: "+a[1]);
		System.out.println("Smallest element: "+a[n-1]);
		s.close();

	}

}
