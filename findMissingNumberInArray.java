package java50;

public class findMissingNumberInArray {
/* To find sum of numbers using formula (n*(n+1))/2 */
	
	static int SumOfNumbers (int n) 
	{
		int sum = (n* (n+1))/2;
		return sum;
	}
	
/* to find sum of the elements in the array */
	static int SumOfElements (int[] array)
	{
		int sum = 0;
		for (int i=0 ; i< array.length ; i++){
			sum = sum + array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 8;
		int[]a = {1,6,3,2,4,7,8};
		
		int SumOfNumbers = SumOfNumbers(n);
		int SumOfElements = SumOfElements(a);
		int MissingNumber = SumOfNumbers - SumOfElements;
		System.out.println("Missing number in array is " + MissingNumber);

	}

}
