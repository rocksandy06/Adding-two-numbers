package Class_Program;

import java.util.Scanner;

public class TestCase_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int odd[]=new int[n];
		int even[]=new int[n];
		int even_index=0,odd_index=0;
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		
		//System.out.println("Enter the array elements one by one: ");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
				even[even_index++]=arr[i];
			else
				odd[odd_index++]=arr[i];
		}
		
		System.out.print("Odd: ");
		for(int i=0;i<odd_index;i++) {
			//if(odd[i]!=0)
			System.out.print(odd[i]+" ");
		}
			
		
		System.out.print("\nEven: ");
		for(int i=0;i<even_index;i++) {
			//if(even[i]!=0)
			System.out.print(even[i]+" ");
		}
		s.close();
		
				
			}
	

}
