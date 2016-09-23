package CS2010.Lecture_8;

public class Case1_NoParamNoRet {
	
	public static void countToTen() {
		for (int i = 0; i < 11; i++){
			System.out.println("Number :- " + i);
		}
	}

	public static void main(String[] args) {
		boolean brat = true;
		if (brat == true){
			countToTen();
		}
		else {
			System.exit(0);
		}
	}

}
