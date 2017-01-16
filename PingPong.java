package java50;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the value of x :");
Scanner scan = new Scanner(System.in);
int x;
 x =scan.nextInt();
 if( x%3==0 && x%5==0) {
	 System.out.println("Ping Pong");
 }else {
	 if ( x%5==0){
		System.out.println("Pong"); 
	 }else{
		 if (x%3==0){
			 System.out.println("Ping");
		 }else
			 System.out.println(x);
	 }
	 }
 
	}
		

}
