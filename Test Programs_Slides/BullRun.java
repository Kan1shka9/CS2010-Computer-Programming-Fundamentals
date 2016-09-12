package CS2010;

public class BullRun {
	public static void main(String args[]){
	int runnerPosition = 400, bullPosition = 600;
	int runnerSpeed = 4, bullSpeed = 7;
	int currSecond = 0;
			
	while(bullPosition > runnerPosition && runnerPosition > 0){
		int runnerLead = bullPosition - runnerPosition;
		System.out.println("At " + currSecond + " second(s), runner is " + runnerPosition + " meters from safety and bull is " + runnerLead + " meters behind him.");	
		runnerPosition -= runnerSpeed;
		bullPosition -= bullSpeed;
		currSecond++;
	}        
			
	if(runnerPosition <= 0) System.out.println("Runner reached safety!");
	else System.out.println("Runner gored at " + runnerPosition + " meters from safety!");

	}
}