package CS2010.Lecture_11;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		  // create the list 
	      List<String> myList = new ArrayList<String>();
	      
	      // add items to the list
	      myList.add("Andy");
	      myList.add("Barry");
	      myList.add("Cathy");    
	      
	      // print the items in the list
	      for(String s: myList) 
	         System.out.println(s);
	      System.out.println();
	      
	      // add another item to the list, then print
	      myList.add("Doug");
	      for(String s: myList) 
	          System.out.println(s);
	      System.out.println(); 
	      
	      // delete an item from the list, then print
	      myList.remove(0);
	      for(String s: myList) 
	          System.out.println(s);
	      
	}

}