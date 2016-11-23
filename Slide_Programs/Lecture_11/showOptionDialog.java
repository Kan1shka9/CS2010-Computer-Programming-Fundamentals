package CS2010.Lecture_11;

/**
 * Method Signature
 * int showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue)
 */

import javax.swing.*;

public class showOptionDialog {

	public static void main(String[] args) {
		
		String[] choices = { "Quit", "Apple Pie", "Easy A", "Boot To The Head" };
		int choice = JOptionPane.showOptionDialog(null, "Choose: ", "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
		JOptionPane.showMessageDialog(null, "you chose option # " + choice + " which is : " + choices[choice]);
		
	}

}