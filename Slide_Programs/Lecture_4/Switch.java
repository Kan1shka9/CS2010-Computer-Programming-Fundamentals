package CS2010.Lecture_4;

import java.util.*;

public class Switch {
	
	 public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		 
		char ageCat = 'y';

		System.out.println("Welcome to John's bar. Please enter your age category: \ny for under 21, m for 21-29, o for 30 and older.  Enter q to quit.");
		String input = sc.next();
		
		ageCat = (char) input.charAt(0);
			
		switch (ageCat) {
			
			case 'y':
				System.out.println("Enjoy your Shirley Temple, Junior");
				break;
					
			case 'm':
				System.out.println("You'd better stick to beer");
				break;
				
			case 'o':
				System.out.println("There's whiskey in the jar.");
				break;
				
			case 'q':
				break;
				
			default:
				System.out.println("Invalid input");
				
		}
	
	} 
	 
}