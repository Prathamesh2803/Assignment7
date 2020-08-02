package Assignment7;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer>runsData=new LinkedList<>();

	public ScoreAnalyzer() {
		super();
		this.runsData = runsData;
	}
	 public boolean addRunsToList(int runs) {
		return runsData.add(runs);
	 }
        public double calcRunRate() {
        	double totalRuns=0;
        	for(int i = 0; i<runsData.size(); i++) {
        		totalRuns+=runsData.get(i);
        		
        	
        }
        	return totalRuns/50;
        	
}
        public double lowestRunScored() {
        	return (Collections.min(runsData));
        }
        public void displayRuns() {
    		for(int i : runsData) {
    			System.out.println(runsData.indexOf(i)+"-"+i);
    			
    		}
    	}
}
