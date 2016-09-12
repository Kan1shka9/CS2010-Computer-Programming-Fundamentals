package CS2010;

public class NegationDemo {
	public static void main(String[] args){
		boolean a = true;
		boolean b = true;
		boolean c = true;
	
		System.out.println(!(a &&(b||c)));

		c = false;
		System.out.println(!(a &&(b||c)));
		
		b = false;
		c = true;
		System.out.println(!(a &&(b||c)));
		
		b = false;
		c = false;
		System.out.println(!(a &&(b||c)));
		
		a = false;
		b = true;
		c = true;
		System.out.println(!(a &&(b||c)));

		c = false;
		System.out.println(!(a &&(b||c)));
		
		b = false;
		c = true;
		System.out.println(!(a &&(b||c)));

		b = false;
		c = false;
		System.out.println(!(a &&(b||c)));
		} // end main()
}
