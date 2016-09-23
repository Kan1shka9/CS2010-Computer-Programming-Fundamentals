package CS2010.Lecture_10;

public class StringSplit {
	public static void main(String args[]){
		String[] tokens = "Java#HTML#Perl".split("#", 0);
		for (int i = 0; i < tokens.length; i++)
		  System.out.print(tokens[i] + " ");
		  //System.out.println(tokens[i] + " ");
	}

}
