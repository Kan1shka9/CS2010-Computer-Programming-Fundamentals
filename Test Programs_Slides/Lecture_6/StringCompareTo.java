package CS2010.Lecture_6;

public class StringCompareTo {

	
		public static void main(String args[]){  
			   String s1 = "SachinBig";  
			   String s2 = "SachinBig";  
			   String s3 = "Ratan";  
			   System.out.println(s1.compareTo(s2));//0  
			   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
			   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
			 }  

	}


