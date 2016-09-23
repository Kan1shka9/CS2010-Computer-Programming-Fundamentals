package CS2010.Lecture_10;

public class ShiftElementLeft {

	public static void main(String[] args) {
		
		// Declare an array
		double[] myList = {1.1, 2, 3, 4.8, 7.0, 3.8};
		System.out.println("Values of the array myList before shifting :- ");
		for (int j = 0; j < myList.length; j++) {
			  System.out.print(myList[j] + " ");
		}
		
		// Retain first element
		double temp = myList[0];
		
		// Shift element left
		for (int i = 1; i < myList.length; i++){
			myList[i-1] = myList[i];
		}
		
		// Move the first element to fill in the last position
		myList[myList.length-1] = temp;
		
		System.out.println("\nValues of the array myList after shifting left :- ");
		for (int j = 0; j < myList.length; j++) {
			  System.out.print(myList[j] + " ");
		}
	}

}
