package CS2010.Lecture_8;

public class MethodScopeDemo {
	
	static int myInt;

	public static void main(String[] args) {
		myInt = 1;
		System.out.println(myInt);
	
		otherMethod();
		System.out.println(myInt);
	}
	
	public static void otherMethod(){
		myInt = 2;
	}

}