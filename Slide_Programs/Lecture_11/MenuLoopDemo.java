package CS2010.Lecture_11;

import javax.swing.*;

public class MenuLoopDemo {

	public static void main(String[] args) {
		MenuLoopDemo d = new MenuLoopDemo();
		d.menu();
	}
	
	public void menu() {
		int choice = 0;
		String[] options = {"Quit", "EasyA", "Swift Kick"};
		do{
			choice = JOptionPane.showOptionDialog(null, "Choose One", "Please Select One", 2, choice, null, options, options);
			switch(choice){
			case 1: easyA();
			break;
			case 2: swiftKick();
			break;
			}
		} while(choice != 0);		
	}
	
	public void easyA() {
		System.out.println("Easy A");
	}
	
	public void swiftKick() {
		System.out.println("Swift Kick!");
	}
	
}