package CS2010.Lecture_11;

import java.util.Random;

public class BooleanRandom {

	public static void main(String[] args) {
		
		Random r = new Random();
		boolean[] bools = new boolean[50];
		
		for (int counter = 0; counter < bools.length; counter++)
			bools[counter] = r.nextBoolean();

		for (int i = 0; i < bools.length; i++)
			System.out.println(bools[i]);

	}

}