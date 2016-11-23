package CS2010.Lecture_6;

public class StringBuilder3 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Bakey");
		System.out.println(sb);
		
		sb.insert(4, "ry");
		System.out.println(sb);
	
		sb.deleteCharAt(5);
		System.out.println(sb);
		
		// this will not do what you expect!
		sb.append(" " + sb.reverse());	
		System.out.println(sb);

		sb.delete(sb.indexOf(" "), sb.length());
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(sb);
		sb.deleteCharAt(5);
		sb2.reverse();
		sb.append(sb2);
		
		System.out.println(sb);
		
		sb.insert(5," ");
		System.out.println(sb);
		
		sb.replace(0,0,"Y");
		System.out.println(sb);

		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}