package CS2010.Lecture_8;

public class ParameterOrderDemo {
	
	public static final double PI = 3.1416;

	public static void main(String[] args) {
		double radius = 1.0;
		double height = 2.0;
		
		double cylVol = calcCylinderVolume(radius, height);		
		System.out.println("radius: " + radius + "; height: " + height + "; cylinder volume: " + cylVol);
	}
	
	public static double calcCylinderVolume(double radius, double height){
		return radius * radius * PI * height;
	}

}
