package java50;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int count, num, item, array[];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the count");
		num = scan.nextInt();
		array = new int[num];
		System.out.println("enter" + num + "integers:");
		for (count=0; count<num; count++)
			array[count]=scan.nextInt();
		System.out.println("enter the value of search" );
		item = scan.nextInt();
		for (count=0; count<num; count++)
		{
			if (array[count] == item)
			{
				System.out.println("The value of search " + item + " is present in the location " + (count+1));
				break;
			}
	
		}
			if (count == num)
			System.out.println("the value of search doesn't exist");
	}

}
