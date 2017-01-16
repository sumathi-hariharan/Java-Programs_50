package java50;
import java.io.*;
 class SubtractInteger {
	
	public static void main(String args[])throws Exception
	{
	int a,b,c;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the two numbers to Subtract:");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c = a-b;
	System.out.println("Difference of two numbers:"+ c);
	}
	}
	


