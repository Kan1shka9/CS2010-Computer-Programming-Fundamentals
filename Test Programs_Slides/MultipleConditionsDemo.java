package CS2010;

public class MultipleConditionsDemo {
	public static void main(String[] args){
		boolean trueCondition = true;
		boolean falseCondition = false;
	
		System.out.println("True is " + (trueCondition?"true":"false"));
		System.out.println("False is " + (falseCondition?"true":"false"));
		
		System.out.println("(True and False) is "+(trueCondition && falseCondition?"true":"false"));
		System.out.println("(True or False) is "+(trueCondition || falseCondition?"true":"false"));
	
		} // end main()
}
