package CS2010.Lecture_6;

public class StringOperations {

	public static void main(String[] args) {
		
		String s1 = "Welcome To Java";
		String s2 = new String("Welcome To Java");
		String s3 = "Welcome To Java";
		
		// String content is same but different location
		if (s1 == s2) {
			System.out.println("Both strings (s1 and s2) are the same object in memory");
		}
		
		// String content is same and s1 and s3 point to the same string (Interned strings)
		if (s1 == s3) {
			System.out.println("Both strings (s1 and s3) are the same object in memory");
		}
		
		// String -> equals
		if (s1.equals(s2)){  
			System.out.println("s1 equals s2");  
		}
		
		if (s1.equals(s3)){  
			System.out.println("s1 equals s3");  
		}
		
		String s4 = "JAVA";
		String s5 = "java";
		
		// String -> equalsIgnoreCase
		if (s4.equalsIgnoreCase(s5)){  
			System.out.println("s4 and s5 are equal after ignoring cases");
		}
	
		// String -> compareToIgnoreCase
		String s8 = "qwertyuiop";
		String s9 = "asd";
		String s6 = "qwertyuiopasdfghjklzxcvbnm";
		
		int r1 = s8.compareToIgnoreCase(s9);
		System.out.println(r1);
		
		int r2 = s8.compareToIgnoreCase(s6);
		System.out.println(r2);		
		
		// String concatenation
		String myString = "Good ";
		String myString1 = "Everyone";
		String myOtherString = myString.concat("Morning");
		String myOtherString1 = myString.concat(myString1);
		System.out.println(myOtherString);
		System.out.println(myOtherString1);
		String out = myString + myString1;
		System.out.println(out);
		
		// String length
		int len = myString.length();
		System.out.println("Length of the string myString is :- " + len);
		
		// String charAt()
		String s = "Immutable";
	    char result = s.charAt(8);
	    System.out.println(result);
	    
	    // String startsWith, endsWith, substring
	    String q1 = "Exiting Java for good";
	    System.out.println(q1.startsWith("Ex"));
	    System.out.println(q1.endsWith("oof"));
	    System.out.println(q1.endsWith("ood"));
	    System.out.println(q1.substring(0,7) + " C++");
	    
	    // toLowerCase, toUpperCase(), trim
	    String q2 = "JAVA BY JAMES GOSLING";
	    System.out.println(q2.toLowerCase());
	    String q3 = "c by anon";
	    System.out.println(q3.toUpperCase());
	    String q4 = "    returns a copy of the string, with leading and trailing whitespace omitted.                          ";
	    System.out.println(q4.trim());
	    
	    // replace, replaceAll, replaceFirst, split
	    String q5 = "Welcome";
	    System.out.println(q5.replace('W', 'X'));
	    String q6 = "zzzzzzzxxxxxxxxxxfffffffffff";
	    System.out.println(q6.replaceAll("x", "a"));
	    System.out.println(q6.replaceFirst("x", "a"));
	    String q7 = "JAVA-BY-ANON-MICHAEL";
	    String[] parts = q7.split("-");
	    for (int i = 0; i < parts.length; i++){
	    	System.out.println(parts[i]);
	    }
	    
	    // indexOf, lastIndexOf
	    String q8 = "This is a text string text";
	    System.out.println(q8.indexOf('x'));
	    System.out.println(q8.indexOf('i', 10));
	    System.out.println(q8.indexOf("text"));
	    System.out.println(q8.indexOf("text", 12));
	    System.out.println("++++++++++++++++++++");
	    System.out.println(q8.lastIndexOf('x'));
	    System.out.println(q8.lastIndexOf('i', 10));
	    System.out.println(q8.lastIndexOf("text"));
	    System.out.println(q8.lastIndexOf("text", 12));

	}

}