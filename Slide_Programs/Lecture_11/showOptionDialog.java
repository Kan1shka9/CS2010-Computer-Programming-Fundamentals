package CS2010.Lecture_11;

import javax.swing.*;

public class showOptionDialog {

	public static void main(String[] args) {
		String[] choices = { "Quit", "Apple Pie", "Easy A", "Boot To The Head" };
		int choice = JOptionPane.showOptionDialog(null, "Choose: ", "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
		JOptionPane.showMessageDialog(null, "you chose option # " + choice + " which is : " + choices[choice]);
	}

}