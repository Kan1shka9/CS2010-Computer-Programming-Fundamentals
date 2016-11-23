/**
 * Can handle integers, double and strings.
 * This program checks for the range of x with do..while
 */

package CS2010.Lecture_7.Validation;

import java.util.*;

public class Validation5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int value = 0;
		String badInputString = null;
		
		do {
			System.out.println("Enter an integer greater than 100");
			while ((sc.hasNextInt() == false)) {
				badInputString = sc.nextLine();
				System.out.println(badInputString + " isn't an integer!  Please try again.");
			}
			value = sc.nextInt();
			sc.nextLine();  // throw away line feed
		} while (value <= 100);
		
		System.out.println(value);
		
	}
	
}