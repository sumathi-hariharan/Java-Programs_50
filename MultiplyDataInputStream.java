package java50;

import java.io.DataInputStream;
import java.io.IOException;

public class MultiplyDataInputStream {

	public static void main(String[] args) throws IOException
	
	{
	
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the first integer value: ");
		int x = Integer.parseInt(dis.readLine());
		System.out.println("Enter the second integer value: ");
		int y = Integer.parseInt(dis.readLine());
		int multiply = x * y;
		System.out.println("Product of given two integers are: " + multiply);
		
		
		
		dis.close();
		
		
		
		
	}

}
