package CS2010.Lecture_8;

public class Case4_ParamRet {

	public static void main(String[] args) {
		
		int radius;
		double circumference;
		radius = 2;
		
		circumference = calcCircumference(radius);
		printCircumference(radius, circumference);
		
		radius = 6;
		
		circumference = calcCircumference(radius);
		printCircumference(radius, circumference);
		
	}
	
	public static double calcCircumference(int r) {
		double circ = r * 2 * Math.PI;	
		return circ;
	}
	
	public static void printCircumference(int r, double c){
		System.out.printf("a circle with radius %d has circumference of %7.4f\n", r, c);
	}
	
}