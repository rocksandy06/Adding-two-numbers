package Class_Program_2;

import java.util.Scanner;

public class Array_example {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []arr= {7,8,12,6,3,4,1,9,7,6,1,4};
		int size = s.nextInt();
		
		for (int j = 0; j < arr.length; j++) {
		    for (int i = j; i < arr.length; i++) {
		        if (arr[j] == arr[i] && j != i) {
		            arr[i] = arr[i];
		            int[] times;
					times[i]++;
		        }
		    }
		}
			
	}
			
		
		
		

	}

}
