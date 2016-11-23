package CS2010.SampleFirstMid;

import java.util.*;

public class Final_Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count :- ");
		int count = sc.nextInt();
		int[] array1 = getInput(count);
		double aver = getAverage(array1);
		System.out.println("Average :- " + aver);
		int c1 = numberOfElements(array1);
		System.out.println("Count :- " + c1);
	}
	
	public static int[] getInput(int count){
		Scanner sc = new Scanner(System.in);
		int[] myList = new int[count];
		System.out.print("Enter the elements :- ");
		for (int i = 0; i < myList.length; i++){
			myList[i] = sc.nextInt();
		}
		return myList;	
	}
	
	public static double getAverage(int[] myList){
		int total = 0;
		double avg = 0;
		for (int i = 0; i < myList.length; i++){
			total += myList[i];
		}
		avg = (double)total / myList.length;
		return avg;
	}
	
	public static int numberOfElements(int[] myList){
		int count = 0;
		double average = getAverage(myList);
		for (int i = 0; i < myList.length; i++){
			if (myList[i] > average){
				count++;
			}
		}
		return count;
	}
}
