package CS2010.SampleFirstMid;

public class SearchArrayDoubles {

	public static void main(String[] args) {
		boolean exists = false;
		double[] arr = {1.2, 2.2, 3.3, 4.4, 5.5, 6.6, 3.1416};
		for (int i = 0; i < arr.length; i++) {
			if ((Math.abs(arr[i] - Math.PI)) < 0.001) {
				exists = true;
			}
		}
		if (exists == true) System.out.println("yes");
		else System.out.println("no");		
	}
}