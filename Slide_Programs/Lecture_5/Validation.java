package CS2010.Lecture_5;

import java.util.*;

public class Validation {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		do {
			
			System.out.println("How old are you?");
			age = sc.nextInt();

		} 
		while (age < 0 || age > 100);
		
		System.out.println("You entered " + age);
	}
	
}