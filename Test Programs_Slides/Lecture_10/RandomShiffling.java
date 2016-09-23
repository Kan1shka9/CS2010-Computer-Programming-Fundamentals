package CS2010.Lecture_10;

// ArrayShuffler.java and RandomShiffling.java are the same program but ArrayShuffler uses enhanced for loop

public class RandomShiffling {

	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8,9,0};
		
		// Random shuffling
		for(int i = 0; i < myList.length; i++) {
		// Generate index j randomly
			int index = (int)(Math.random() * myList.length);
			// Swap myList[i] with myList[j]
			int temp = myList[i];
			myList[i] = myList[index];
			myList[index] = temp;
		}
		
		// Printing values from an array
		System.out.println("Values of the array myList are :- ");
			for (int j = 0; j < myList.length; j++) {
				System.out.print(myList[j] + " ");
			}
	}
}