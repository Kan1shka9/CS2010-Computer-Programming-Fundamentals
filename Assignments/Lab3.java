/**
 * Write a Java class that performs the user's choice of geometric calculations. 
 * 1.) Write a method that takes three parameters, namely one String and two doubles. The method should generate a prompt based on the String and require the user to enter a double value that is no less than the first double and no larger than the second. For example, if the method is called with parameters "radius", 0.0 and 100.5, the prompt will say "Please enter a value between 0.0 and 100.5 for the radius." Do not use if statements or other conditionals to match specific possible Strings; instead, use the String parameter in the prompt.
 * Use a while or do...while loop to ask the user repeatedly until s/he enters a value within the correct range. Validate for the data type as well as the numeric range; the application must not crash on invalid input. When the user enters valid input, the method should return the value entered. Use this method to get whatever input is required from the user for each type of calculation in the other methods listed below.
 * 2.) In main(), prompt the user to choose one of the following: quit, calculate the perimeter of a circle, calculate the volume of a sphere, or calculate the volume of a cylinder. Get the user's choice and use a switch statement to call the appropriate method for the operation the user chooses. This prompt must be inside a loop that will terminate when the user chooses to quit. The user will be able to make as many calculations as s/he chooses, continuing until he or she choose to quit.
 * 3.) Use a separate method for each type of calculation. Note that the circle and sphere methods method will each ask only for a radius, while the cylinder method will ask separately for a radius and a height.
 * 4.) Return the result of each calculation to main, and display it. Do not do any output in the calculation methods.
 * 5.) Keep track of the largest perimeter, sphere volume, and cylinder volume seen so far. When the program terminates, show the size of the largest example of each type. 
 * 6.) Use these formulas:
 * 		Perimeter of a circle: 2 * PI * radius
 * 		Volume of a sphere: 4/3 π r3
 * 		Volume of a cylinder: π r2 * height
 * 7.) Limit each variable to the most restrictive scope that will work.
 */
package Homework1;

import java.util.*;

public class Lab3 {
	
	public static double choose(String dimension, double one, double two){
		Scanner in = new Scanner(System.in);
		double out1 = 0.0;
		String badInputString = null;
		do {
			System.out.print("Please enter a value between " + one + " and " + two + " for the " + dimension + " :- ");
			while (!(in.hasNextDouble())) {
				badInputString = in.nextLine();
				System.out.println(badInputString + " is not a value between 0.0 and 100.0.");
				System.out.print("Please enter a value between " + one + " and " + two + " for the " + dimension + " :- ");
			}
			out1 = in.nextDouble();
		} while (out1 < one && out1 > two);
		return out1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menu = 0;
		double max_per_cir = 0, max_vol_sph = 0, max_vol_cyl = 0;
		while(menu != 4) {
		System.out.println("Enter a number between 1 and 4 : - ");
		System.out.println("1.) Perimeter of a circle");
		System.out.println("2.) Volume of a sphere");
		System.out.println("3.) Volume of a cylinder");
		System.out.println("4.) Quit");
		int choice = input.nextInt();
		
		
			switch(choice) {
	        case 1 :
	           double radius_circle = choose("radius", 0.0, 100.0);
	           System.out.println("Perimeter of a circle :- " + PerimeterCircle(radius_circle) + "\n");
	           double temp_cir = PerimeterCircle(radius_circle);
	           if (max_per_cir < temp_cir) {
	        	   max_per_cir = temp_cir;
	           }
	           break;
	        case 2 :
	        	double radius_sphere = choose("radius", 0.0, 100.0);
	        	System.out.println("Volume of the sphere :- " + VolumeSphere(radius_sphere) + "\n");
	        	double temp_sph = VolumeSphere(radius_sphere);
		           if (max_vol_sph < temp_sph) {
		        	   max_vol_sph = temp_sph;
		           }
	            break;
	        case 3 :	        	
	        	double radius_cylinder = choose("radius", 0.0, 100.0);
	        	double height_cylinder = choose("height", 0.0, 100.0);
	        	System.out.println("Volume of the cylinder :- " + VolumeCylinder(radius_cylinder, height_cylinder) + "\n");
	        	double temp_cyl = VolumeCylinder(radius_cylinder, height_cylinder);
		           if (max_vol_cyl < temp_cyl) {
		        	   max_vol_cyl = temp_cyl;
		           }
	            break;
	        case 4 :
	            System.out.println("Quitting ...");
	            System.out.println("Largest value of perimeter of a circle :- " + max_per_cir);
	            System.out.println("Largest value of volume of a sphere :- " + max_vol_sph);
	            System.out.println("Largest value of volume of a cylinder :- " + max_vol_cyl);
	            System.exit(0);
	        default :
	            System.out.println("Invalid option");
			}
		}
	}
	
	public static double PerimeterCircle(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public static double VolumeSphere(double radius) {
		return (4 * Math.PI * radius * radius * radius)/3;
	}
	
	public static double VolumeCylinder(double radius, double height) {
		return (Math.PI * radius * radius * height);
	}
	
}