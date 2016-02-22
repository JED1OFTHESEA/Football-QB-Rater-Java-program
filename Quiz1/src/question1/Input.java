package question1;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//User Inputed Variables
		
		double passing_attempts;
		double num_completions;
		double passing_yards;
		double touchdown_passes;
		double interceptions;
		
		//Calculated variables
		
		double completions_attempts;
		double yards_attempts;
		double touchdowns_attempts;
		double interceptions_attempts;
		double passer_rating;
		
		//Getting information from the user
		
		System.out.println(
				"Enter the quarterbacks number of passing attempts");
		passing_attempts=scan.nextInt();
				
		System.out.println(
				"Enter the number of completions the quarterback has had");
		num_completions=scan.nextInt();
		
		System.out.println(
				"Enter the number of passing yards the quarterback has had");
		passing_yards=scan.nextInt();
		
		System.out.println(
				"Enter the number of touchdown passes the quarterback has had");
		touchdown_passes=scan.nextInt();
		
		System.out.println(
				"Enter the number of interceptions the quarterback has had");
		interceptions=scan.nextInt();
		
		//Calculations
		
		completions_attempts=((num_completions/passing_attempts)-.3)*5;
		yards_attempts=((passing_yards/passing_attempts)-3)*.25;
		touchdowns_attempts=(touchdown_passes/passing_attempts)*20;
		interceptions_attempts=2.375-((interceptions/passing_attempts)*25);
		passer_rating=
				((completions_attempts*yards_attempts*touchdowns_attempts*interceptions_attempts)/6)*100;
		
		System.out.println("This quarterbacks passer rating is "+passer_rating+".");
				
	}

}
