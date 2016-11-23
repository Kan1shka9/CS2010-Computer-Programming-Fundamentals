package CS2010.Lecture_10;

public class ArrayReturn {

	public static void main(String[] args) {
		int arraySize = 10;
		int[] intArray = getIntArray(arraySize);
		printArray(intArray);
	}
	
	public static int[] getIntArray(int size) {
		int[] retArray = new int[size];
		for(int counter = 1; counter <= size; counter++) {
			retArray[counter-1]=counter;
		}
		return retArray;
	}
	
	public static void printArray(int[] arrayToPrint) {
		for(int i = 0; i < arrayToPrint.length; i++)
			System.out.println("array[" + i + "] contains value " + arrayToPrint[i]);
	}
	
}