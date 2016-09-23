package CS2010.Lecture_10;

public class BinaryPractise {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int key = 3;
		int index = binary(arr, key);
		System.out.println(index);
	}
	
	public static int binary(int[] arr, int key){
		int low = 0;
		int high = arr.length - 1;
		
		while (high >= low) {
			int mid = (high + low) / 2;
			if ( key < arr[mid]){
				high = mid -1;
			}
			else if (arr[mid] == key){
				return mid;
			}
			else {
				low = mid +1;
			}
		}
		return -1;	
	}
}
