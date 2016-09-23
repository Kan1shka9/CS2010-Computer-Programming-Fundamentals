/**
 * Program can handle integer and strings(can handle strings such as Ex:- "one two")
 * For validation of double replace all int with double
 * This program does not check for range of integer value "x"
 */

package CS2010.Lecture_7.Validation;

import java.util.*;

public class Validation4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		String badInputString = null;
		System.out.println("Enter an integer");
		while ((sc.hasNextInt() == false)) {
			badInputString = sc.nextLine(); 
			System.out.println(badInputString + " isn't an integer!  Please try again.");
		}
		x = sc.nextInt();
		System.out.println(x);
	}
}