package CS2010.Lecture_7;

import javax.swing.JOptionPane;

public class InputBox {

	public static void main(String[] args) {
			String input = JOptionPane.showInputDialog(null, "Please enter some input ");
			JOptionPane.showMessageDialog(null, "You entered: \"" + input + "\"");
			String input2 = input.concat(" " + JOptionPane.showInputDialog(null, "Please enter some more input "));
			JOptionPane.showMessageDialog(null, "You entered: \"" + input2 + "\"");
		}
	}