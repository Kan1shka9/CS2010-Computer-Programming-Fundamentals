package CS2010.Lecture_10;

// Anonymous arrays in Java is an Array without any name
// In Anonymous array we don't store it in any reference variable
// Creation and initialization of anonymous array is done at the same time

public class AnonymousArray {

	public static void main(String[] args) {
		System.out.println("Total :- " + sum(new int[]{1, 2, 3, 4}));
	}
	
	//method which takes an array as argument
    public static int sum(int[] numbers) {
        int total = 0;
        for(int i: numbers){
            total = total + i;
        }
        return total;
    }
    
}