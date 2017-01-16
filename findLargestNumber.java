package java50;

import java.util.Scanner;

public class findLargestNumber {

	public static void main(String[] args) {
		int num,large;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number of elements in array");
	    num =scanner.nextInt();
	    int a[] = new int[num];
	    for (int i=0; i<num; i++) {
	    	a[i] = scanner.nextInt();
	    }
	    	large=a[0];
	    	for(int i=0; i<num; i++) {
	    		if (large< a[i]){
	    			large = a[i];
	    		}
	    	}
	    		System.out.println("largest number in the given array " + large);
	    	}	 

	}


