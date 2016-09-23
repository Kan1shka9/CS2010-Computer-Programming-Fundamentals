package CS2010.SampleFirstMid;

import java.util.*;

public class SampleProgAgain {

	public static void main(String[] args) {
		boolean[] original_array =  getBooleanArrayFromInput(5);
		showPercentageTrue(original_array);
		System.out.println("\nArray before reversing :- ");
		for (int l = 0; l < original_array.length; l++){
			System.out.println(original_array[l]);
		}
		System.out.println("\nArray after reversing :- ");
		boolean[] reverse_array = reverseBooleanArray(original_array);
		for (int m = 0; m < reverse_array.length; m++){
			System.out.println(reverse_array[m]);
		}
	}
	
	public static boolean[] getBooleanArrayFromInput(int count) {
		Scanner sc = new Scanner(System.in);
		boolean input[] = new boolean[count];
		System.out.println("Enter the boolean values of the array");
		for (int i = 0 ; i < count ; i++){
			
			input[i] = sc.nextBoolean();
		}
		return input;	
	}
	
	public static void showPercentageTrue(boolean[] arr){
		double count_true = 0;
		double percent = 0;
		for (int j = 0; j < arr.length; j++){
			if (arr[j] == true){
				count_true++;
			}
		}
		percent = (count_true / arr.length) * 100;
		System.out.printf("\nArray contains %d booleans, of which %2.3f%% are true.", arr.length, percent);
		System.out.println("");
	}
	
	public static boolean[] reverseBooleanArray(boolean[] arr){
		for (int k = 0; k < arr.length; k++){
			if (arr[k] == true){
				arr[k] = false;
			}
			else {
				arr[k] = true;
			}
		}
		return arr;		
	}
}
