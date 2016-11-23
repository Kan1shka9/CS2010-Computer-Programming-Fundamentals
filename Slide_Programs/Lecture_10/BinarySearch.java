package CS2010.Lecture_10;

public class BinarySearch {

	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8,9,0};
		int key = 9;
		int index = binarySearch(myList, key);
		System.out.println("The value " + key + " is at index : - " + index);
	}
	
	public static int binarySearch(int[] list, int key) {
		 int low = 0;
		 int high = list.length - 1;

		 while (high >= low) {
		   int mid = (low + high) / 2;
		   if (key < list[mid])
			   high = mid - 1;
		   else if (key == list[mid])
			   return mid;
		   else
			   low = mid + 1;
		 }
		 return -1 - low;		  
	}
	
}