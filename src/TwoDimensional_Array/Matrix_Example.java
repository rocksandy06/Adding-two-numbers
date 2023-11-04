package TwoDimensional_Array;

public class Matrix_Example {

	public static void main(String[] args) {
		//a[][]=new int[3][3];
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,9,10},
		};
		int col=a[0].length;
		int row=a.length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
