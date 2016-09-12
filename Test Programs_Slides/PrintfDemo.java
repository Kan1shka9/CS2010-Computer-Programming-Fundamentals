package CS2010;

public class PrintfDemo {
	public static void main(String[] args){
		int intVar = 1;
		double doubleVar = 3.14159;
		double moonRadius = 1737000;  // in meters   
		char charVar = 'a';
		String stringVar = "Hi, Mom";
		boolean boolVar = true;
		
		System.out.printf("\nintVar: %d; \ndoubleVar: %f; \ndoubleVar to 4 places: %10.4f; \nmoonRadius: %e; \ncharVar: %c; \nstringVar: %s",
intVar, doubleVar, doubleVar, moonRadius, charVar, stringVar);
	}
}
