package CS2010.Lecture_11;

public class VariableLengthArgumentLists {

	public static void main(String[] args) {
		System.out.println(sumAll(0,0));
		System.out.println(sumAll(0,1,2));
		System.out.println(sumAll(0,1,2,3));
	}
	
	public static int sumAll(int... numbers){
		int total = 0;
		for(int i: numbers)
		total += i;
		return total;
	}
}