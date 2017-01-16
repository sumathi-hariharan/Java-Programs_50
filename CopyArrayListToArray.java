package java50;



	import java.util.ArrayList;
	 
	public class CopyArrayListToArray {
	 
	    public static void main(String a[]){
	        ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("Monday");
	        arrl.add("Tuesday");
	        arrl.add("Wednesday");
	        arrl.add("Thursday");
	        arrl.add("Friday");
	        arrl.add("Saturday");
	        arrl.add("Sunday");
	        System.out.println("Actual ArrayList:"+arrl);
	        String[] strArr = new String[arrl.size()];
	        arrl.toArray(strArr);
	        System.out.println("Created Array:");
	        for(String str:strArr){
	            System.out.println(str);
	        }
	    }
	}
	