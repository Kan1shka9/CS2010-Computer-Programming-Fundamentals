package CS2010.Lecture_11;

public class PrintRowNumberColumnNumber {

	public static void main(String[] args) {
		int rows = 8;
		int columns = 8;
		String[][] twoD = new String[rows][columns];
		
		// Prints the row number and column number of every matrix element.
		for(int rowCounter = 0; rowCounter < twoD.length; rowCounter++){
			for(int colCounter = 0; colCounter < twoD[rowCounter].length; colCounter++){
				twoD[rowCounter][colCounter] = "Row: " + rowCounter + " Col: " + colCounter ;
			}		
		}
		
		// Printing the 2-D array to console
		for(int x = 0; x < twoD.length; x++){
			System.out.println("\n");
			for(int y = 0; y < twoD[x].length; y++){
				System.out.print("\t\t" + twoD[x][y] );
			}		
		}
	}
}