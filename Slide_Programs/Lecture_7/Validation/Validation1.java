/**
 * Can only handle integers(not strings) but checks if the age parameter is in a certain range.
 */

package CS2010.Lecture_7.Validation;

import java.util.*;

public class Validation1 {

	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("How old are you? ");
			age = sc.nextInt();
		} while (age < 0 || age > 100);
		
		System.out.println("Age :- " + age);
		
	}

}