package java50;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		int i, fact=1, count;
		System.out.println("Enter the count value:");
		Scanner scan = new Scanner (System.in);
		count = scan.nextInt();
		
		for(i=1; i<=count;i++) {
			
			fact = fact*i;
		}
			System.out.println( "Factorial of the given number is:"  + fact);
	}

}


