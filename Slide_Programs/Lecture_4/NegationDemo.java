package CS2010.Lecture_4;

public class NegationDemo {
	public static void main(String[] args){
		boolean a = true;
		boolean b = true;
		boolean c = true;
	
		System.out.println(!(a &&(b||c))); // false

		c = false;
		System.out.println(!(a &&(b||c))); // false
		
		b = false;
		c = true;
		System.out.println(!(a &&(b||c))); // false
		
		b = false;
		c = false;
		System.out.println(!(a &&(b||c))); // true
		
		a = false;
		b = true;
		c = true;
		System.out.println(!(a &&(b||c))); // true

		c = false;
		System.out.println(!(a &&(b||c))); // true
		
		b = false;
		c = true;
		System.out.println(!(a &&(b||c))); // true

		b = false;
		c = false;
		System.out.println(!(a &&(b||c))); // true
		} // end main()
}
