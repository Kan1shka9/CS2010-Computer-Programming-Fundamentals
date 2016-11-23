package CS2010.Lecture_5;

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		
		int count = 0;
		int n = 5;
		
		for(int a = 1; a <= n; a++) {
			
			for(int b = 1; b <= n; b++) {
				
				System.out.printf("\nvariable a: %d\t variable b: %d", a, b);
				count++;
				
			}
			
		}
		
		System.out.println("\ntotal number of prints: " + count);
	}
	
}