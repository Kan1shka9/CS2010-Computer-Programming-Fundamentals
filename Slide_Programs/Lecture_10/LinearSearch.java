package CS2010.Lecture_10;

public class LinearSearch {

	public static void main(String[] args) {
		int[] myList = {1,2,3,4,5,6,7,8,9,0};
		int key = 8;
		int index = linearSearch(myList, key);
		System.out.println("The value " + key + " is at index : - " + index);
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++)
		    if (key == list[i])
		      return i;
		  return -1;
	}
	
}