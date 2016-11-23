package Homework1;

public class Lab1 {	
	
	/**
	 * Fahrenheit to Celsius converter
	 * @param F is value in Fahrenheit
	 * @return celsius
	 */
	public double converter(double F) {
		double C = (F - 32) * 5/9;
		return C;
	}
	
	public static void main(String[] args) {
	/**
	 * 1.) Declares an int with value 201 and casts it to a double
	 */
	int a = 201;
	double b = (double) a;
	System.out.println("1.) Integer 201 casted to a double :- " + b);

	/**
	 * 2.) Declares a double variable with the value 3.14159 and casts it to an int
	 */
	double c = 3.14159;
	int d = (int) c;
	System.out.println("2.) Double 3.14159 casted to an integer :- " + d);
	
	/**
	 * 3.) Declares an int variable with the value 2147483647, then adds 1. 
	 * 	   Output the value both before and after the addition.
	 */
	int e = 2147483647;
	int f = e + 1;
	System.out.println("3.) Before adding 1 :- " + e + " After adding 1 :- " + f);
	
	/**
	 * 4.) Declares a boolean variable called tall and sets it to true if you are at least 5' 10", otherwise false.
	 */
	double height;
	boolean tall;
	height = 180.34;
	if (height > 177.80)
	{
		tall = true;
		System.out.println("4.) My height is more than 5\'10\" hence tall is :- " + tall);
	}
	else
	{
		tall = false;
		System.out.println("4.) Height is less than 5\'10\" hence tall is :- " + tall);
	}
	
	/**
	 * 5.) Declares a long variable with the value 2147483647, then adds 1. 
	 * Output the value both before and after the addition.
	 */
	long value_before = 2147483647;
	long value_after = value_before + 1;
	System.out.println("5.) Value before addition :- " + value_before + " Value after addition :- " + value_after);
	
	/**
	 * 6.) Calculates the volume of a sphere this way:
	 * 		1. Declares a final double called PI with the value 3.1416
	 * 		2. Declares an int variable called radius and sets its value to 5
	 * 		3. Uses the formula V = 4/3 PI radius^3 to calculate the volume. Show the result to exactly three digits past the decimal point.		
	 */
	final double PI = 3.1416;
	int radius = 5;
	double V;
	V = (4 * PI * (radius * radius * radius))/3;
	System.out.format("6.) Volume of the sphere :- %.3f \n" , V);
	
	/**
	 * 7.) Converts your height in inches to your height in centimeters this way:
	 *		1. Creates a final double called INCHESTOCM and sets its value to the appropriate conversion constant, which is 2.54.
	 *		2. Creates a variable of type double and sets its value to your height in inches. I do not care whether you tell the truth about this.
	 *		3. Calculates and outputs your height in cm. Use the formula CM = inches * INCHESTOCM.
	 */
	final double INCHESTOCM = 2.54;
	double inches = 70.4724;
	double CM = inches * INCHESTOCM;
	System.out.println("7.) My height in centimeters is :- " + CM + " cms");
	
	/**
	 * 8.) Uses the formula C = (F - 32) * 5/9 to convert the following values from fahrenheit to celsius: -40, 0, and 212.
	 */
	Lab1 obj = new Lab1();
	System.out.println("8.) \n\t -40 Fahrenheit :- " + obj.converter(-40) + " celsius");
	System.out.println("\t 0 Fahrenheit :- " + obj.converter(0) + " celsius");
	System.out.println("\t 212 Fahrenheit :- " + obj.converter(212) + " celsius");
	
	/**
	 * 9.) Tests two values for divisibility by 13 this way:
	 *			1. Creates an int variable, sets its value to 143, and uses modulo to determine whether the value is evenly divisible by 13
	 *			2. Assigns the new value 144 to the int variable, and uses modulo to determine whether the value is evenly divisible by 13
	 */
	int value_1 = 143;
	if(value_1 % 13 == 0)
	{
		System.out.println("9.1) 143 is divisible by 13");
	}
	else
	{
		System.out.println("9.1) 143 is not divisible by 13");
	}
	
	int value_2 = 144;
	if(value_2 % 13 == 0)
	{
		System.out.println("9.2) 144 is divisible by 13");
	}
	else
	{
		System.out.println("9.2) 144 is not divisible by 13");
	}
	
	/**
	 * 10.) Determine and output whether it is true that 2 * 6 is greater than 10 and false that 7 is less than 5. Use a logical operator.
	 */
	if (2 * 6 > 10 && 7 < 5)
	{
		System.out.println("10.) True");
	}
	else
	{
		System.out.println("10.) False");
	}
	
	/**
	 * 11.) Declares variables of the appropriate types and sets them to your age in years and GPA (no need to tell the truth) and determines and outputs whether each of the following conditions is true. In each case, use one if statement that contains a logical operator, *not* nested if statements.
	 *		a) either your age is greater than 30 or your GPA is greater than 3.5
	 *		b) your age is greater than 30 *and* your GPA is also greater than 3.5.
	 *		c) either your age is not greater than 30 or your GPA is not greater than 3.5.
	 *		d) your age is greater than 30 but your GPA is not greater than 3.5.
	 */
	int age = 28;
	double gpa = 3.6;
	if (age > 30 || gpa > 3.5)
	{
		System.out.println("11.1.) Either your age is greater than 30 or your GPA is greater than 3.5");
	}
	if (age > 30 && gpa > 3.5)
	{
		System.out.println("11.2.) Your age is greater than 30 *and* your GPA is also greater than 3.5.");
	}
	if (age < 30 || gpa < 3.5)
	{
		System.out.println("11.3.) Either your age is not greater than 30 or your GPA is not greater than 3.5.");
	}
	if (age > 30 && gpa < 3.5)
	{
		System.out.println("11.4.) Your age is greater than 30 but your GPA is not greater than 3.5.");
	}
	
	}
}