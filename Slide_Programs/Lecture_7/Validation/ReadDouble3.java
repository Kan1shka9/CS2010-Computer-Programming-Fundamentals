/**
 * Program can handle double, integer and string(but not completely EX:- fails for "one two")
 */
package CS2010.Lecture_7.Validation;

import java.util.Scanner;

public class ReadDouble3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double inpDouble = 10.0; 
		// bad code ahead!!
		do {
			System.out.print("Input a double.  Enter 0 to quit:");
			if(input.hasNextDouble() == true){
				inpDouble = input.nextDouble();
				System.out.println("\nYou entered: " + inpDouble);
				}
			else{
				input.next();
			}			
		} while (inpDouble != 0.0);
	}
}
