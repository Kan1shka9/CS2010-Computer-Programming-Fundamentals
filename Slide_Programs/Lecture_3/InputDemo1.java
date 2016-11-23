package CS2010.Lecture_3;

import java.util.*;

public class InputDemo1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("Nice to meet you, " + name);
		
		System.out.print("Input a double:");
		double myDouble = input.nextDouble();
		System.out.println("\nYou entered: " + myDouble);

	}
	
}