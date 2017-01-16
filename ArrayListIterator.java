package java50;



	import java.util.ArrayList;
	
	import java.util.ListIterator;
	
	public class ArrayListIterator {
	
	  public static void main(String[] args) {
	
	    // Create an ArrayList 
	
	    ArrayList arrayList = new ArrayList();
	    arrayList.add("element_1");
	    arrayList.add("element_2");
	    arrayList.add("element_3");
	    arrayList.add("element_4");
	    arrayList.add("element_5");
	
	    // To print list of elements using the ListIterator() method
	    ListIterator it = arrayList.listIterator();
	    System.out.println("List of Elements :");
	    while(it.hasNext())
	    System.out.println(it.next());
	    
	    // To print list in reverse order using ListIterator 
	    System.out.println("List in reverse order :");
	    while(it.hasPrevious())
	    System.out.println(it.previous());
	
	    // To Add an element into the Array list 
	    it.add("element_6");
	    System.out.println("ArrayList after adding a new element : ");
	    for(int i = 0; i < arrayList.size(); i++)
	    System.out.println(arrayList.get(i));
	    
	    // To Search an element in Array list
	    boolean blnFound = arrayList.contains("element_2");
	    System.out.println("Does arrayList contain element_2 ? " + blnFound);
	 
	    //Using indexOf(Object element) method to return the index of the specified element in ArrayList.
	    //It returns -1 if not found.
	    
	 
	    int index = arrayList.indexOf("element_3");
	    if(index == -1)
	      System.out.println("ArrayList does not contain element_3");
	    else
	      System.out.println("ArrayList contains element_3 at index :" + index);
	    
            }
       
	  }
	
	

