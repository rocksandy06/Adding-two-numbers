package TwoDimensional_Array;

import java.util.Scanner;

public class Matrix_Example_4 {



		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the row: ");
			int row=s.nextInt();
			System.out.print("Enter the column: ");
			int col=s.nextInt();
			int a[][]=new int[row][col];
			int b[][]=new int[row][col];
			int c[][]=new int[row][col];
			System.out.println("Matrix A: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					a[i][j]=s.nextInt();
				}
			}
			System.out.println("Matrix B: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					b[i][j]=s.nextInt();
				}
			}
			System.out.println("Array matrix A elements: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Array matrix B elements: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Matrix Addition: ");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();	
				}
					
				
			
					
		}			
			
}