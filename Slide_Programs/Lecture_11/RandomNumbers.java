package CS2010.Lecture_11;

import java.util.*;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] nums = new int[50];
		
		for (int counter = 0; counter < nums.length; counter++)
				nums[counter] = r.nextInt(100); // here bound is 100
		
		// Array object has many predefined methods associated with it.
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++)
				System.out.print(nums[i] + " ");
		
	}
	
}