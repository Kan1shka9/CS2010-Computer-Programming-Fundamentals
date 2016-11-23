package CS2010.Lecture_7;

import javax.swing.JOptionPane;

public class NumericCastDemo {
	
	public static void main(String[] args) {
		
		int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age"));
		
		if(age < 30) {
			JOptionPane.showMessageDialog(null, age + " is pretty young.");
		}
		
		else if(age > 100) {
			JOptionPane.showMessageDialog(null, "really?");
		}	
		
		else {
			JOptionPane.showMessageDialog(null, "That's OK. Methuseleh lived to be " + (270 - age) + " years older than you are now.");
		}
		
	}
	
}