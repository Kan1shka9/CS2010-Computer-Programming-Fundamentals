package CS2010.Lecture_8;

public class ScopeDemo2 {
	
	static String classString = new String();
	
	public static void main(String[] args) {
		String mainString = new String();
		
		for(int counter = 0; counter < 1; counter++) {
			String loopString = new String();
			System.out.println("loop output: \n" + classString + "\n" + mainString +"\n" + loopString);
		}

		otherMethod();
		
		if(1+1 == 2) {
			classString = "class string";
			mainString = "main string";
			System.out.println("if output: \n" + classString + "\n" + mainString);
			// printing or assigning a value to loopString here would cause an error
			// loopString = "loopString";
		}
		
		System.out.println("output from main after end of if block:\n" + mainString);
		otherMethod();
		System.out.println("output from main after returning from otherMethod: \n" + classString);
	}
	
	public static void otherMethod() {
		System.out.println("\notherMethod output: \n" + classString);
		// using mainString here would cause an error because it is out of scope
		classString = "new value of class string";
	}
	
}