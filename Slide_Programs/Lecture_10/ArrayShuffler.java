package CS2010.Lecture_10;

// ArrayShuffler.java and RandomShiffling.java are the same program but ArrayShuffler uses enhanced for loop

public class ArrayShuffler {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for(int n: numbers) System.out.println(n);
		for(int i = 0; i < numbers.length; i++){
			int index = (int) (Math.random() * numbers.length);			
			int temp = numbers[i];
			numbers[i]=numbers[index];
			numbers[index] = temp;
		}
		System.out.println("\n");
		for(int n: numbers) System.out.println(n);
	}
}
