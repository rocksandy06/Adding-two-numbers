package Class_Program_3;

import java.util.Scanner;

public class Logic_Examples {
	//return input * 3;

	private static Scanner scanner;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter an input number: ");
        scanner = null;
		int input = s.nextInt();

        int output = calculateOutput(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
		

	}

	private static int calculateOutput(int input) {
		// TODO Auto-generated method stub
		return input *3;
	}

}
