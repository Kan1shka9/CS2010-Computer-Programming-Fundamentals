package CS2010.SampleFirstMid;

import java.util.*;

public class SampleProg {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the length of the array :- ");
		int count = obj.nextInt();
		boolean myList[] = getBooleanArrayFromInput(count);		
		showPercentageTrue(myList);
		boolean myNewList[] = reverseBooleanArray(myList);
		System.out.println("Contents of the array myList :- " + Arrays.toString(myList));
		System.out.println("After the operation...... ");
		System.out.println("Contents of the array myNewList :- " + Arrays.toString(myNewList));
	}
	
	public static boolean[] getBooleanArrayFromInput(int count){
		boolean myList[] = new boolean[count];
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the elements of the array :- ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = obj1.nextBoolean();
		}
		return myList;
	}
	
	public static void showPercentageTrue(boolean myList[]){
		double numberOfTrue = 0;
		for (int i = 0 ; i < myList.length ; i++){
			if (myList[i] == true)
				numberOfTrue++;
		}
		System.out.printf("Array contains %d booleans, of which %2.3f%% are true. \n", myList.length, (( numberOfTrue / myList.length ) * 100));		
	}
	
	public static boolean[] reverseBooleanArray(boolean myList[]){
		boolean myNewList[] = new boolean[myList.length];
		for (int j = 0; j < myList.length; j++){
			myNewList[j] = myList[j];
		}
		for (int k = 0; k < myNewList.length; k++){
			if(myNewList[k] == true) {
				myNewList[k] = false;
			}
			else if(myNewList[k] == false){
				myNewList[k] = true;
			}
		}
		return myNewList;
	}
}