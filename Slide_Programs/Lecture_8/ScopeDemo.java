package CS2010.Lecture_8;

public class ScopeDemo {
	
	static String classString = "This string is visible everywhere in this class";

	public static void main(String[] args) {
		String mainString = "This string is visible only in the main method";
		
		for(int counter = 0; counter < 1; counter++) {
	 	       String loopString = "This string is visible only inside the loop";
		       System.out.println("main method output: \n" + classString + "\n" + mainString +"\n" + loopString);
		}
		otherMethod();
		// trying to print loopString or otherMethodString here would cause an error because they are not in scope
		// System.out.println(loopString);
		// System.out.println(otherMethodString);
	}
	
	public static void otherMethod() {
		String otherMethodString = "This string is visible only in otherMethod()";
		System.out.println("\notherMethod output: \n" + classString + "\n" + otherMethodString);
		// trying to print mainString or loopString here would cause an error because they are not in scope
		// System.out.println(MainString);
		// System.out.println(loopString);
	}

}