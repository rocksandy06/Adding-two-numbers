package Class_Program;

import java.util.Scanner;

public class Sum20peterson {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=s.nextInt();
		int temp=num;
		int n=1,sum=0;
		while(num!=0) {
			int r=num%10;
			for(int i=1;i<=r;i++) {
				n=n*i;
			}
			sum=sum+n;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("PETERSON NUMBER");
		}
		else {
			System.out.println("NOT PETERSON NUMBER");
		}
		s.close();
			
		
			
		

	}

}
