package CS2010.Lecture_4;

public class ShorthandDemo {
	
	public static void main(String[] args){
		
		int firstInt = 5;

		for(int secondInt = 0; secondInt < 10; secondInt++) {

			int a = 0;
			
			a=(firstInt < secondInt)?1:0;
			
			System.out.println(a);
			System.out.println(firstInt < secondInt?"true!":"false!");
			
		} 

	} 

}