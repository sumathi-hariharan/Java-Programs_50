package java50;

public class Swap {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = 0;
		System.out.println( "Original value before swapping: x =" +x +" "  +  "y=" +y);
		swapWithoutThird(x,y);
		swapWithThird(x , y, z);
				
		}

	public static void swapWithoutThird(int x, int y) {
		
		x =  x+y;
		y = x-y;
		x = x-y;
		System.out.println( "After swapping without using third variable: x =" +x +" " +  "y=" +y);
		
	}
	
	public static void swapWithThird(int x, int y, int z){
		
		z = x;
		x=y;
		y=z;
		System.out.println("After swapping using third variable: x=" +x +" " + "y=" +y);	
		
	}
	
	}




