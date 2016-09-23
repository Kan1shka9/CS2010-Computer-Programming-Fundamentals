package CS2010.Lecture_6;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Welcome");
		String s2 = "Welcome";
		String s3 = s1;
		String s4 = new String("Welcome");
	
		if (s1.equals(s2)){  
			System.out.println("s1 equals s2");  
		}
		else System.out.println("s1 does not equal s2");
 
		if (s1 == s2) {
			System.out.println("s1 == s2");  
		}
		else System.out.println("s1 != s2");

		if (s1.equals(s3)){  
			System.out.println("s1 equals s3");  
		}
		
		if (s1 == s3) {
			System.out.println("s1 == s3");  
		}
		else System.out.println("s1 != s3");

		if (s1.equals(s4)){  
			System.out.println("s1 equals s4");  
		}
		else System.out.println("s1 does not equal s4");
		
		if (s1 == s4){  
			System.out.println("s1 == s4");  
		}
		else System.out.println("s1 != s4");
		}	
}
