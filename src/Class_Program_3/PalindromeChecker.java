package Class_Program_3;

import java.util.Scanner;

/*public class Palidrome {

	public static void main(String[] args) {
		
		
		
		
		Scanner s= new Scanner(System.in);
		arr[]= {"racecar","malayalam","example","encap"};
		
        //System.out.print("Enter a string: ");
        StringBuffer s1=new StringBuffer();
        
       /* String reversed = "";
        
        for (int i = arr.length() - 1; i >= 0; i--) {
            reversed += arr.charAt(i);
        }
        
        if (arr.equalsIgnoreCase(reversed)) {
            System.out.println(arr + " is a palindrome.");
        }
        
        s1.setLength(arr[]);
        System.out.println(s1);
		System.out.println(s1.reverse());
		
		char[] n=arr[].toCharArray();
		for(int i= arr[].length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	    System.out.println();
        
    }
    
    */

		

public class PalindromeChecker {
    public static void main(String[] args) {
        String[] arr = {"racecar", "malayalam", "example", "encap"};
        
        for (String word : arr) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
    
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}	


