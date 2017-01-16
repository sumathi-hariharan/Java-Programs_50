package java50;


	import java.util.HashSet;
	 
	public class DuplicateInArray 
	{   
	    public static void main(String[] args) 
	    {
	        String[] strArray = {"272", "544", "272", "789", "968", "abc", "abc"};
	 
	        HashSet<String> set = new HashSet<String>();
	 
	        for (String arrayElement : strArray)
	        {
	            if(!set.add(arrayElement))
	            {
	                System.out.println("Duplicate Elements are : "+arrayElement);
	            }
	        }
	    }    
	
	}


