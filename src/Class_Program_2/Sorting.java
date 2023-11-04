package Class_Program_2;


public class Sorting{
	
	public int[] arr;
		

	public Sorting(int[] arr2) {
		this.arr = arr2;
	}

	public Sorting(int[] arr2,int[] arr1) {
		this.arr = arr2;
	}

	public int[] bubbleSort1() {
		
        int i=0,j=0,temp;
        

        for (i=0;i<arr.length;i++) {
        	for(j=i+1;j<arr.length;j++) {
            
                if (arr[i]> arr[j]) {
                     temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
                }
            
            System.out.print(" " +arr[i]);
            
            
        }
        return arr;
		
	}
	}
	
	public int[] bubbleSort2() {
		
        int i=0,j=0,temp;
        

        for (i=0;i<arr.length;i++) {
        	for(j=i+1;j<arr.length;j++) {
            
                if (arr[i]> arr[j]) {
                     temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
                }
            }
            System.out.print(" " +arr[i]);
            
            
        }
        return arr;
		
	}
	
	
	
}