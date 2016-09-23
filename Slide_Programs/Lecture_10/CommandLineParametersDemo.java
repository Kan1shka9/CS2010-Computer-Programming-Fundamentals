package CS2010.Lecture_10;

public class CommandLineParametersDemo {

	public static void main(String[] args) {
		boolean brat = true;
		String crime = args[0];
		int limit = Integer.valueOf(args[1]);

		if(brat == true) count(limit, crime);
 	}

	public static void count(int max, String offense){
		System.out.println("Alright, I'm going to count to " + max + ", and if you don't stop " + offense + " by the time I'm done, you are in big trouble!");
		for(int counter = 1; counter <= max; counter++){
			System.out.println("that's "  + counter);
		}
	}
}