package CS2010.Lecture_8;

public class UglyMess {

	public static void main(String[] args) {
		int firstRadius = 2;
		double firstCircumference = firstRadius * 2 * 3.1416;
		System.out.printf("a circle with radius %d has circumference of %7.4f\n", firstRadius, firstCircumference);	
		
		int secondRadius = 6;
		double secondCircumference = secondRadius * 2 * 3.14159;
		System.out.printf("a circle with radius %d has circumference of %7f\n", secondRadius, secondCircumference);
		
		int thirdRadius = 11;
		double thirdCircumference = thirdCircumference = thirdRadius * 2 * 3.142;
		System.out.printf("a circle with r = %d has circumference of %7.4f\n",  thirdRadius, (thirdRadius * 2 * 3.142));
		
		double fourthCircumference = 11 * 2 * 3.14;
		System.out.printf("a circle with radius 11 has circumference of %7.4f\n", fourthCircumference);
	}

}
