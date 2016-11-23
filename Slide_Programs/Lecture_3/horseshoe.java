package CS2010.Lecture_3;

public class horseshoe {
	
	public static final double BUMPSTODOTS = 0.5;
	public static final int ALPHTOBARRY = 1;
	
	public static void main(String[] args) {
		
		double size0 = 0;
		double size1 = 1;
		double size4 = 4;
		
		double barrySize;
		
		barrySize = size0 * BUMPSTODOTS + ALPHTOBARRY;
		System.out.println("Alphabet City size " + size0 + " = Barrytown size " + barrySize);

		barrySize = size1 * BUMPSTODOTS + ALPHTOBARRY;
		System.out.println("Alphabet City size " + size1 + " = Barrytown size " + barrySize);
		
		barrySize = size4 * BUMPSTODOTS + ALPHTOBARRY;
		System.out.println("Alphabet City size " + size4 + " = Barrytown size " + barrySize);
		
	}
	
}