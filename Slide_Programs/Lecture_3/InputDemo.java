package CS2010.Lecture_3;

import java.util.*;

public class InputDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string to test nextLine() :-");
		String stringnextline = input.nextLine();
		System.out.println("You entered :-" + stringnextline); 
		
		double myDouble = 0.0; 
		System.out.print("Input a double:");
		myDouble = input.nextDouble();
		System.out.println("You entered: " + myDouble);

	}
}
