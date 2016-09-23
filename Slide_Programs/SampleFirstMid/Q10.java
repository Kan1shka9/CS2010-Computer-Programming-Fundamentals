package CS2010.SampleFirstMid;

public class Q10 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = ')';
		int alpha_a = (int) ch1;
		int symb_close_brace = (int) ch2;
		
		
		if (alpha_a > symb_close_brace) {
			System.out.println("A value " + alpha_a + " has bigger unicode value than ')' " + symb_close_brace);
		}
		else {
			System.out.println("')' " + symb_close_brace + " has bigger unicode value than A " + alpha_a);
		}
	}
}
