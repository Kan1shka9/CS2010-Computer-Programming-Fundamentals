package CS2010.Lecture_6;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Welcome to ");
		System.out.println(stringBuilder);
		
		stringBuilder.append("Java");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(11, "HTML and ");
		System.out.println(stringBuilder);
		
		stringBuilder.delete(8, 11); // changes the builder to Welcome HTML and Java.
		System.out.println(stringBuilder);
		
		stringBuilder.deleteCharAt(8); // changes the builder to Welcome TML and Java.
		System.out.println(stringBuilder);
		
		stringBuilder.reverse(); // changes the builder to avaJ dna LMT emocleW
		System.out.println(stringBuilder);
		
		stringBuilder.reverse(); // undoes the reverse()
		System.out.println(stringBuilder);
		
		stringBuilder.replace(11, 15, " to"); // changes the builder to Welcome TML to Java.
		System.out.println(stringBuilder);
		
		stringBuilder.delete(7,11);   // back to Welcome to Java
		System.out.println(stringBuilder);
		
		stringBuilder.setCharAt(0, 'w'); // sets the builder to welcome to Java.
		System.out.println(stringBuilder);
	}

}
