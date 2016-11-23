package CS2010.Lecture_11;
import java.util.Arrays;
import java.util.Random;

public class RandomNumbersNextGaussian {
	
	public static final double MEAN = 100;
	public static final double SDV = 10;

	private static double[] nums;

	public static void main(String[] args) {
		
		Random r = new Random();
		nums = new double[40];
		
		for (int counter = 0; counter < nums.length; counter++)
			nums[counter] = r.nextGaussian()*SDV + MEAN;
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++)
		System.out.println(nums[i]);
		
	}
	
}