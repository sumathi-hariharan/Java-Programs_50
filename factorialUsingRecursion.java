package java50;

import java.util.Scanner;

public class factorialUsingRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scan.nextInt();
		int Factorial = fact(num); //called the user defined function 'fact'//
		System.out.println("Factorial of the given number using recursion method is:" + Factorial);

	}

	static int fact(int num) {
		int output;
		if (num==1) {
			return 1;
		}
				output= fact(num-1)*num; //recursion means function calling itself//
					return output;
				
	}
		
		
}


