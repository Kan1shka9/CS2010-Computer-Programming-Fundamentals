package CS2010.SampleFirstMid;

import javax.swing.*;

public class Q4ab {

	public static void main(String[] args) {
		//int temp = JOptionPane.showInputDialog("Please enter the current temperature");
		int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the current temperature"));
		JOptionPane.showMessageDialog(null, temp);
		
		//if(Math.abs(Math.PI - x) == .001) System.out.println("x = PI!");
		double x = 3.141;
		System.out.println(Math.PI);
		System.out.println(Math.abs(Math.PI - x));
		if(Math.abs(Math.PI - x) < .001) System.out.println("x = PI!");
	}
}
