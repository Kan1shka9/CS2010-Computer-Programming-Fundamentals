package CS2010.Lecture_10;

public class ArrayCopyTraditional {

	public static void main(String[] args) {
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++)
		   targetArray[i] = sourceArray[i];
		
		// Printing values from an array
		System.out.println("Values of the array targetArray are :- ");
		for (int j = 0; j < targetArray.length; j++) {
			System.out.print(targetArray[j] + " ");
		}
	}

}
