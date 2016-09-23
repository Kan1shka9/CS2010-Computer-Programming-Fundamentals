package CS2010.SampleFirstMid;

public class AvgOfDoubleList {

	public static void main(String[] args) {
		double[] myList = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8};
		System.out.println(avg(myList));
	}
	
	public static double avg(double[] arr) {
		double avg = 0.0; 
		double total = 0.0;
		for (int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		avg = total / arr.length;
		return avg;		
	}

}
