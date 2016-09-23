package CS2010.SampleFirstMid;

public class Q3d {

	public static void main(String[] args) {
		String[][] myArray = new String[10][10];  
		for (int row = 0; row < myArray.length; row++) { 
			for (int column = 0; column < myArray[row].length; column++) { 
				myArray[row][column] = String.valueOf(row + column);
			}
		}
		
		for(int x = 0; x < myArray.length; x++){
			System.out.println("\n");
			for(int y = 0; y < myArray[x].length; y++){
				System.out.print("\t" + myArray[x][y]);
			}		
		}
	}
}

