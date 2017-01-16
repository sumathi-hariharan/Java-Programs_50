package java50;

public class commonNumber {

	public static void main(String[] args) {
		int arr1[] = {3,6,4,7,8};
		int arr2[] = {9,5,6,1,0,2};
		for  ( int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Common Number in the given two array is " + arr1[i]);
				}
			}

	}

}
}
