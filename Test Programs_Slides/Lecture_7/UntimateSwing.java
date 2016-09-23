package CS2010.Lecture_7;

import javax.swing.*;

public class UntimateSwing {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog(null, "Enter your name :- ");
		JOptionPane.showMessageDialog(null, "Your name is :- " + s1);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age :- "));
		JOptionPane.showMessageDialog(null, "Age :- " + age);
		
		if(age < 10){
			JOptionPane.showMessageDialog(null, "Too young");
		}
		else{
			JOptionPane.showMessageDialog(null, "Old enough");
		}
		
		double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your salary"));
		JOptionPane.showMessageDialog(null, "Your salary is :- " + salary);
		if(salary > 1000){
			JOptionPane.showMessageDialog(null, "Nice!!");
		}
		else{
			JOptionPane.showMessageDialog(null, "Yak!!");
		}
	}

}
