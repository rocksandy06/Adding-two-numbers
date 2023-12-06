package Class_Program_3;

public class LinearSearch_Example {
	
		static int search(int arr[], int n, int x)
		{
			for (int i = 0; i < n; i++) {
				
				if (arr[i] == x)
					return i;
			}

			
			return -1;
		}

		public static void main(String[] args)
		{
			int[] arr = { 33, 24, 15, 71, 59, 86 };
			int n = arr.length;
			
			int x = 15;

			int index = search(arr, n, x);
			if (index == -1)
				System.out.println("Element is not present in the array");
			else
				System.out.println("Element found at position " + index);
		}
	

	
	
}    


