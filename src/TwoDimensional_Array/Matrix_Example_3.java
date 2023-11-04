package TwoDimensional_Array;

import java.util.Scanner;

public class Matrix_Example_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row=s.nextInt();
		System.out.print("Enter the column: ");
		int col=s.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter the matrix element one by one: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Array matrix A elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
				
			
		}s.close();
	}

}
