package CS2010.Lecture_9;

import javax.swing.JOptionPane;

public class Overload {
	public static void main(String[] args){
		int x = 0;
		x = getInt();
		JOptionPane.showMessageDialog(null, "You chose " + x);
		int min = 2;
		int max = 10;
		x = getInt(min, max);
		JOptionPane.showMessageDialog(null, "You chose " + x);
 	}
	
	public static int getInt(){
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer"));
		return x; 
	}

	public static int getInt(int low, int high){
		int val = low - 1;
		do{
			val = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer between " + low + " and " + high));
		} while(val < low || val > high);
		return val; 
	}
}