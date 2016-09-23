package CS2010.Lecture_8;

public class HidingDemo {
	
	static int x = 1;

	public static void main(String[] args) {
		int y = otherMethod(x);
		System.out.println(x);
		System.out.println(y);
	}
	
	public static int otherMethod(int x){
		x = 2;		
		return x;   // this x “hides” the global x
	}
}
