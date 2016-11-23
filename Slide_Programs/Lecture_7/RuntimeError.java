package CS2010.Lecture_7;

public class RuntimeError {

	public static void main(String[] args) {
		
		int y = 10;
		
		for(int x = 0; x <= 10; x++) {
			y -= 1;
			System.out.println(10 / y);			
		}
		
	}

}