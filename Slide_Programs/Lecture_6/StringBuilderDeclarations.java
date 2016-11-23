package CS2010.Lecture_6;

public class StringBuilderDeclarations {

	public static void main(String[] args) {
		
		// Default size of StringBuilder is 16
		StringBuilder sb = new StringBuilder();		
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder(5);		
		System.out.println(sb1.capacity());
		
		StringBuilder sb2 = new StringBuilder("this is a new string");		
		System.out.println(sb2.capacity());

	}

}