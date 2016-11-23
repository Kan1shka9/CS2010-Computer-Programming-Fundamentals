package CS2010.Lecture_4;

public class NestedIfDemo {
	
	public static void main(String[] args){
		
		boolean trueCondition = true;
		boolean falseCondition = false;	
		
		if(trueCondition) {
			
			if(falseCondition) 
				System.out.println("true and false");
			
			else 
				System.out.println("true and ~false");
		}
		
		else {
			
			if(falseCondition) 
				System.out.println("~true and false");
			
			else 
				System.out.println("~true and ~false");
			
		}	
		
	}

}