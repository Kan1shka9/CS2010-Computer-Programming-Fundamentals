package CS2010.Lecture_3;

import java.util.*;

public class InputDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;

		System.out.println("What is your name?");
		name = input.next();
		System.out.println("Nice to meet you, " + name);
		
		double myDouble = 0.0; 
		System.out.print("Input a double:");
		myDouble = input.nextDouble();
		System.out.println("\nYou entered: " + myDouble);

	}
}
