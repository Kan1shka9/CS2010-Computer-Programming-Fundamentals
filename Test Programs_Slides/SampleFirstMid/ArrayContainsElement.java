package CS2010.SampleFirstMid;

import java.util.*;
import javax.swing.*;

public class ArrayContainsElement {

	public static void main(String[] args) {
		int[] theArray = {1,2,3,4,5,6,7};
		int x = 5;
		System.out.println(containsInt(theArray, x));
	}
	
	public static boolean containsInt(int[] theArray, int x){
		boolean present = false;
		for (int i = 0 ; i < theArray.length ; i++){
			if (theArray[i] == x) {
				present = true;
			}
		}
		return present;	
	}
}