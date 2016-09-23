/**
 * Program can handle double inputs(but not string) and check if the value of double is 0.0. If so it exits the loop.
 */

package CS2010.Lecture_7.Validation;

import java.util.Scanner;

public class ReadDouble2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double stuff = 0.0; 
		do {
			System.out.print("Input a double. Enter 0 to quit:");
			stuff = input.nextDouble();
			System.out.println("\nYou entered: " + stuff);
		} while (stuff != 0.0);
	}
}