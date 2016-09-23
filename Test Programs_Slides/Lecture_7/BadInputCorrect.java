package CS2010.Lecture_7;

import java.util.Scanner;

public class BadInputCorrect {

	public static void main(String[] args) {
		int value = 0;
		String badInputString = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter an integer greater than 100");
			while (!(sc.hasNextInt())) {
				badInputString = sc.nextLine();
				System.out.println(badInputString + " isn't an integer!  Please try again.");
			}
			value = sc.nextInt();
			sc.nextLine();  // throw away linefeed
		} while (value <= 100);
		System.out.println(value);
	}

}