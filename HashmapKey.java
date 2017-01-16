package java50;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Set;

	public class HashmapKey {
		public static void main(String[] args) {
		     // Creating a HashMap
		     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		 
		     //adding elements to the HashMap
		     hmap.put(1, "Monday");
		     hmap.put(2, "Tuesday");
		     hmap.put(3, "Wednesday");
		     hmap.put(4, "Thursday");
		 
		     // Getting values from HashMap
		     String val1=hmap.get(2);
		     System.out.println("The Value mapped to Key 2 is:"+ val1);
		 
		     // Key "7" is not mapped to any value so it returns Null
		      
		     String val2=hmap.get(7);
		     System.out.println("The Value mapped to Key 7 is:"+ val2);
		  }
		}	