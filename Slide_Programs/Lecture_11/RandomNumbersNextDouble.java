package CS2010.Lecture_11;

// nextDouble() generates pseudorandom  positive doubles less than 1 with to a uniform, not Gaussian, distribution.

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersNextDouble {
	
	public static void main(String[] args) {
		Random r = new Random();
		double[] nums = new double[20];
		
		for (int counter = 0; counter < nums.length; counter++)
			nums[counter] = r.nextDouble();
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
			System.out.println("\n\n");
	}
}