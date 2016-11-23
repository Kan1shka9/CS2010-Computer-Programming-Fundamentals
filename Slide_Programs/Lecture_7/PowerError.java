package CS2010.Lecture_7;

// Logic error

public class PowerError {

	public static void main(String[] args) {
		
		int answer = 1;
		
		for(int power = 0; power <= 10; power++) {
			answer = answer * 2;		
			System.out.println("2 ^ " + power + " = " + answer);
		}

	}

}