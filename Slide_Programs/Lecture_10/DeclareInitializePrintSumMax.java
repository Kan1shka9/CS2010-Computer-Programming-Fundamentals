package CS2010.Lecture_10;

import java.util.*;

public class DeclareInitializePrintSumMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare an array of type double
		double[] myList = new double[10];
		
		// Initializing an array with input values
		System.out.println("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		}
		
		// Printing values from an array
		System.out.println("\nValues of the array myList are :- ");
		for (int j = 0; j < myList.length; j++) {
			  System.out.print(myList[j] + " ");
		}
		
		System.out.println("");
		
		// Summing all elements of an array
		double total = 0;
		for (int k = 0; k < myList.length; k++) {
		  total += myList[k];
		}
		System.out.println("\nSum of the elements of an array are :- " + total);
		
		// Finding the largest element
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
		  if (myList[i] > max) max = myList[i];
		}
		System.out.println("\nMax value is :- " + max);

		input.close();
	}
}
