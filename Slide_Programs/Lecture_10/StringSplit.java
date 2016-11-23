package CS2010.Lecture_10;

public class StringSplit {
	
	public static void main(String args[]) {
		
		String s1 = "Java#HTML#Perl";
		
		String[] tokens = s1.split("#", 0);
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		  	
	}

}