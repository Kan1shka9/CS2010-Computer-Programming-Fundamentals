package CS2010.Lecture_9;

public class NoPassByReferenceDemo {

	public static void main(String[] args) {
		StringBuilder tagLine = new StringBuilder("Ah, Satan sees Natasha");
		System.out.println(tagLine);
		otherMethod(tagLine);
		System.out.println(tagLine);
	}

	public static void otherMethod(StringBuilder myStringBuilder) {
		myStringBuilder.reverse();
	}	
}
