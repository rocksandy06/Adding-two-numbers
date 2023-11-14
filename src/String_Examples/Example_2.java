package String_Examples;

public class Example_2 {

	public static void main(String[] args) {
		String[] arr1 = {"Hello", "World"};
        String[] arr2 = {"Java", "Programming"};

        
        String[] mergedArray = mergeArrays(arr1, arr2);

        
       
		//System.out.println("Merged Array: " + array.toString(mergedArray));
    }

    private static String[] mergeArrays(String[] arr1, String[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int mergedLength = length1 + length2;

        String[] mergedArray = new String[mergedLength];

        
        System.arraycopy(arr1, 0, mergedArray, 0, length1);

        
        System.arraycopy(arr2, 0, mergedArray, length1, length2);

        return mergedArray;
    }


	}