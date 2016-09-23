package CS2010.SampleFirstMid;

import javax.swing.*;

public class Q4d {
	
	public static int[] getIntArrayFromInput(int count) {
		int[] theArray = new int[count];
		for (int i = 0; i < count; i++){
			theArray[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer value"));
		}
		// return theArray[i];
		return theArray;	
	}

	public static void main(String[] args) {
		getIntArrayFromInput(3);
	}
}
	
