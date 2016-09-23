package CS2010.Lecture_8;

public class Case2_ParamNoRet {

	public static void main(String[] args) {
		int limit = 3;
		String crime = "breaking dishes";
		count(limit, crime);
		limit = 6;
		crime = "hitting your brother";
		count(limit, crime);
	}

	public static void count(int max, String offense){
		System.out.println("Alright, I'm going to count to " + max + ", and if you don't stop " + offense + " by the time I'm done, you are in big trouble!");
		for(int counter = 1; counter <= max; counter++){
			System.out.println("that's "  + counter);
		}
	}
}
