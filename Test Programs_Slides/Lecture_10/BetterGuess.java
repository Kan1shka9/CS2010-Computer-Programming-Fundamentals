package CS2010.Lecture_10;

import javax.swing.JOptionPane;

public class BetterGuess {

	public static void main(String[] args) {
		int tries = 0;
		int high = 100;
		int low = 0;
		int guess;
		int direction;	
		do {
			guess = (high + low) / 2;
			String[] choices = { "Older", "This Old", "Younger" }; 
			direction = JOptionPane.showOptionDialog(null, "Are you " + guess + "?", "Age Guess", JOptionPane.DEFAULT_OPTION,  JOptionPane.PLAIN_MESSAGE, null, choices, "Age Guess");
			if (direction == 0)
				low = guess + 1; // last guess was too low
			if (direction == 2)
				high = guess - 1; // last guess was too high
			tries++;			
		} while (direction != 1);
		System.out.println("Guessed in " + tries + " tries");
	}
}
