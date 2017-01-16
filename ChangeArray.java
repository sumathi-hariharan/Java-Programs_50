package java50;

public class ChangeArray {
	
	
		public static void main(String[] args) { 
		String a [] = new String[] {"a1","a2","a3","a4","a5","a6","a7","b1","b2","b3","b4","b5","b6", "b7"}; 

		int n= a.length; 
		int j =n/2; 
		for(int i=0 ; i < n ; i+=2){ 
		String tmp= a[j]; 
		shift(a,i+1,(j)); 
		a[i+1]=tmp; 
		j++; 
		} 
		for(int i=0 ; i < n ; i++){ 
		System.out.print( a[i] + "," ); 
		} 
		} 

		private static void shift(String[] a, int i, int j) { 
		for(int k = j ; k >=i ; k-- ){ 
		a[k]=a[k-1]; 
		} 

		} 

		}


		
	
	