package Class_Program_4;

public class BinarySearchMain<BinarySearch1> {

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
	    int array[] = { 3, 4, 5, 6, 7, 8, 9 };
	    int n = array.length;
	    int x = 7;
	    int result = ob.binarySearch(array, x, 0, n - 1);
	    if (result == -1)
	      System.out.println("Not found");
	    else
	      System.out.println("Element found at index " + result);
	  }
	
	     
	  }
	 
	     
	    
	  
	



