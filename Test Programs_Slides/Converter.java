package CS2010;

public class Converter {
	public static void main(String[] args){
		double celsius;
		double fahrenheit = 212;
		celsius = (fahrenheit -32) * 5.0/9;
		System.out.println(fahrenheit + " degrees F = " + celsius + " degrees C");
	}
}