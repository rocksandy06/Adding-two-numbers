package Class_Program_2;

import java.util.Scanner;

public class Remove_DuplicateElements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n];
		int replaceIndex=0,a,j,k,l,m,flag;
		for(int a=0;a<n;a++) {
			arr[a]=s.nextInt();
		
		for(int j=0;j<n;j++) {
			flag=0;
			for(int k=i+1;k<n;k++) {
				if(arr[k]!=arr[j]) {
					break;
				
			}
			
		}
		for(int l=0;l<replaceIndex;l++) {
				if(temp[l]==arr[a])
					flag=1;
			}
			if(flag==0)
				temp[replaceIndex++]=arr[a];
			j=a-1;
		for(int m=0;m<replaceIndex;m++)
			System.out.println(temp[a]+" ");
		s.close();
			
					
				
				
				
				
				

	
	}

}
