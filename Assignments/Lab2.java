/**
 * Write a program that calculates the effect that various possible grades in CS2011 would have on the user's GPA
 * 1.) Use Console input to ask the user for his or her present GPA and the number of total units he or she has taken. Cast these to a Double and an Integer.
 * 2.) For each of the above variables, ask the user repeatedly until s/he enters reasonable values. A GPA cannot be greater than 4.0 nor less than 0.0, and the number of units completed can't be less than 0. The program must not crash if the user enters input that cannot be parsed to the numeric types (for example, if user inputs the word "old" when asked his/her age).
 * 3.) For simplicity, you may assume the user is not taking any other classes this term.
 * 4.) Note that CS2011 is a 3 unit class. Use a variable or constant for this value so that you could easily change it if you wanted to apply this program to another class.
 * 5.) The new GPA is calculated this way: ((present GPA * existing units) + (new units * grade)) / (existing units + new units).
 * 6.) Use a loop to find the effect on the student's GPA for each possible grade in CS201. A corresponds to 4 grade points, A- to 3.7, B+ to 3.3, B to 3, B- to 2.7, C+ to 2.3, and C to 2.0. Do not use the letter grades, only the numeric values. Use a while or do...while loop containing if/else code that decrements the grade by 0.3 if it was 4.0, 3.3, 3.0, or 2.3 or decrements it by 0.4 if it was 3.7 or 2.7.
 * 7.) You will need to use Math.abs() in the loop test. Due to the imprecision of floating point types, you will not get correct results if you simply test whether a grade is, for example, equal to 3.0. See lecture 5.
 * 8.) Think carefully about the test in the while or do...while loop. The loop should break after the output is shown for a grade that is near 2.0, which is a double.
 * 9.) For each possible grade, show the grade, the new GPA, and the change between the old and new GPAs.
 */
package Homework1;

import java.util.*;

public class Lab2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int gpa = 0;
		double d_gpa = (double) gpa;
		int i_units = 0;
		double units = 0.0;
		
		try{
			do {
				System.out.print("Enter your GPA :- ");
				d_gpa = obj.nextDouble();
			}while(d_gpa < 0.0 || d_gpa > 4.0);
				System.out.println("The entered GPA is :- " + d_gpa);			
	
			do {
				System.out.print("Enter the number of units :- ");
				units = obj.nextDouble();
				i_units = (int) units;
			}while(i_units < 0);
			System.out.println("The total units you entered are :- " + i_units); 
		} catch (Exception e) {
			System.out.println("Kindly enter a valid GPA/unit value.");
		}
		
		final int UNITS_2011 = 3;
		double grade = 4.0;
		
		do{
			double newGPA = ((d_gpa * i_units) + (UNITS_2011 * grade)) / (i_units + UNITS_2011);
			System.out.printf("The new GPA value is :- %2.2f\n" , newGPA);
			System.out.printf("Difference between old and new GPA :- %2.2f\n" , Math.abs(grade-4.0));
			if (Math.abs(grade - 4.0) < 0.0001 || Math.abs(grade - 3.3) < 0.0001 || Math.abs(grade - 3.0) < 0.0001 || Math.abs(grade - 2.3) < 0.0001 || (Math.abs(grade - 2.0) < 0.0001)){
				grade -= 0.3;
			}
			else if (Math.abs(grade - 3.7) < 0.0001 || Math.abs(grade - 2.7) < 0.0001){
				grade -= 0.4;
			}
		} while (grade > 2.0);
	}
}