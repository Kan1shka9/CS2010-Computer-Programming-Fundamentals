package CS2010.Lecture_3;

public class BooleanDemo {
	
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println(i + " < " + 5 + "? " + (i < 5));
		System.out.println(i + " == " + 5 + "? " + (i == 5));
		System.out.println(i + " > " + 5 + "? " + (i > 5) + "\n");

		i = 5;
		System.out.println(i + " < " + 5 + "? " + (i < 5));
		System.out.println(i + " == " + 5 + "? " + (i == 5));
		System.out.println(i + " > " + 5 + "? " + (i > 5) + "\n");

		i = 6;
		System.out.println(i + " < " + 5 + "? " + (i < 5));
		System.out.println(i + " == " + 5 + "? " + (i == 5));
		System.out.println(i + " > " + 5 + "? " + (i > 5) + "\n");

		System.out.println("(1 == 1) == (2 == 1)? " + ((1 == 1) == (2 == 1)));
		System.out.println("(1 < 2) == (2 < 3)? " + ((1 < 2) == (2 < 3)));
		
	}
	
}