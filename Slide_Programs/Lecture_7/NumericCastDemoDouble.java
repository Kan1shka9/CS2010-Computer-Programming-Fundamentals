package CS2010.Lecture_7;

import javax.swing.JOptionPane;

public class NumericCastDemoDouble {

	public static void main(String[] args) {
		
		double age = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your age"));
		
		if(age < 30) {
			JOptionPane.showMessageDialog(null, age + " is pretty young.");			
		}	
		
		else if(age > 100) {
			JOptionPane.showMessageDialog(null, "really?");
		}	
		
		else {
			JOptionPane.showMessageDialog(null, "That's OK. Methuseleh lived to be " + (270 / age) + " times as old as you are now.");
		}
		
	}
	
}