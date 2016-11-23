package CS2010.Lecture_4;

public class Precision {
	
	public static void main(String[] args) {
		
		double d = 1.23456789;
		double e = d;
		
		e = e + 1;
		e = e - 1;
		
		System.out.println("d = " + d + "; e = " + e);
		
	} 

}