package Assignment7;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreAnalyzer sa=new ScoreAnalyzer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Batsmens: ");
		int batsmen = sc.nextInt();
		
		System.out.println("Enter Runs");
		
		for (int i = 0; i < batsmen; i++) {
			
			sa.addRunsToList(sc.nextInt());
		}

		sa.displayRuns();
		System.out.println("Run Rate: " + sa.calcRunRate()+"\t");
		System.out.println("Lowest Runs Scored: " + sa.lowestRunScored());
		System.out.println("No.of Batsmens: " + batsmen);

	}
	}

	


