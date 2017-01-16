package java50;

import java.util.Scanner;

public class inputCommandLine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scanner.next();
		System.out.println("enter the age");
		int age = scanner.nextInt();
		System.out.println(name + ", your age is" + age);
		 
				 

	}

}
