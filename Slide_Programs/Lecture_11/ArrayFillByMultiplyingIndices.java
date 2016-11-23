package CS2010.Lecture_11;

public class ArrayFillByMultiplyingIndices {

	public static void main(String[] args) {
		
		int rows = 6;
		int columns = 11;
		int[][] twoD = new int[rows][columns];
		
		// Printing the value of the number of rows and columns
		// Here the number 5 can be replaced by any number between 0 and 5 as the total number of rows are 6
		System.out.println(twoD.length);
		System.out.println(twoD[5].length);
		
		// Filling the elements of the matrix by multiplying the values of row and column.
		for(int x = 0; x < twoD.length; x++) {
			for(int y = 0; y < twoD[x].length; y++) {
				twoD[x][y] = x * y;
			}		
		}
		
		// Printing the 2-D array to console
		for(int x = 0; x < twoD.length; x++) {
			System.out.println("\n");
			for(int y = 0; y < twoD[x].length; y++) {
				System.out.print("\t" + twoD[x][y]);
			}		
		}
		
	}
	
}