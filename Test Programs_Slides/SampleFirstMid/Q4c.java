package CS2010.SampleFirstMid;

import javax.swing.*;

public class Q4c {
	
	public static String[] getStringArrayFromInput(int n) {
		String[] theArray = new String[n];
		for (int counter = 0; counter < n; counter++){
				theArray[counter] = JOptionPane.showInputDialog(null, "Please enter a String value");		
				//return theArray;
		}
		return theArray;
	}

	public static void main(String[] args) {
		getStringArrayFromInput(2);
	}
}
