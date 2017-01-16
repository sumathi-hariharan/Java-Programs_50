package java50;

import java.util.Scanner;

public class SumOfIntegerFileHandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the First Number");
		int firstNumber = scan.nextInt();
		System.out.println("Enter the Second Number");
		int secondNumber = scan.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("Sum of 2 integers = " + sum);
	}

}
