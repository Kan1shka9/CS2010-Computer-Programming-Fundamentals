package CS2010.Lecture_3;

public class PrintfDemo {
	
	public static void main(String[] args){
		
		int intVar = 1;
		double doubleVar = 3.14159;
		double moonRadius = 1737000;  // in meters   
		char charVar = 'a';
		String stringVar = "Hi, Mom";
		boolean boolVar = true;
		
		System.out.printf("intVar: %d; \ndoubleVar: %f; \ndoubleVar to 4 places: %10.4f; \nmoonRadius: %e; \ncharVar: %c; \nstringVar: %s; \nboolVar : %b", 
				intVar, doubleVar, doubleVar, moonRadius, charVar, stringVar, boolVar);
		
	}
	
}