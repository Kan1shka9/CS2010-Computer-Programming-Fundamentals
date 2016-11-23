package CS2010.Lecture_8;

import javax.swing.JOptionPane;

public class Case3_NoParamRet {

	public static void main(String[] args) {
		int choice = getChoice();
		System.out.println("you say you are " + choice);
	}

	public static int getChoice() {
		int choice = 0;
		String choiceString = null;
		while(choice < 1 || choice > 100){
			choiceString = JOptionPane.showInputDialog(null, "Please enter your age :- ");
			choice = Integer.parseInt(choiceString);
		}
		
		return choice;
		
	}
	
}