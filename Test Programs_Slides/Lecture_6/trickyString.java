package CS2010.Lecture_6;

public class trickyString {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s1 = "zxc";
		System.out.println(s1);
		System.out.println(s2);
		char h = s1.charAt(0);
		h = 'G';
		System.out.println(s1);
	}

}
