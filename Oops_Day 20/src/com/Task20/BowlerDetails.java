package com.Task20;
/*Create a BLC(Business Logic Class) called Bowler. Add below details to the class.
 1. Instance variables:
 name: private-String,
 wickets: private-int,
 matches: private-int,
 balls_bowled: private-int,
 runs_conceded: private-int.
 2. Method - bowlerDetails() : public void
 Create a method name called bowlerDetails() that accepts name, wickets, matches, balls_bowled and runs_conceded.
Method name: bowlerDetails 
Return type: void
 3. Create below public methods,
 Method name: computeBowlingAverage
 Return type: void
 This method should print the bowling average of the bowler by dividing runs_conceded with wickets.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.
 Output:
 Name: Sachin
 bowling_avg=46.3
 Note: a. If any values are negative print 'Error'.
 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
 Method name: computeStrikeRate
 Return type: void
 This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.
 Output:
 Name: Sachin
 Strike_rate=0.61733335
 Note: a. If any values are negative print 'Error'.
 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
 Method name: showStatistics
 Return type: void
 This method should print the details of the batter.
 Input:
 name = "Sachin",
 wickets = 10,
 matches = 5,
 balls_bowled = 750,
 runs_conceded 463.
 Output:
 Name=Sachin
 wickets=10
 matches=5
 balls_bowled=750
 runs_conceded=463
 Note: a. If any values are negative print 'Error'.
 b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.
 An ELC(Executable Logic Class) Test that contains main method. Use this class to test your code.*/
class Bowler{
    //Declare class variables
	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	//This method is used to set instance values
	public void bowlerDetails(String pname, int pwickets, int pmatches, int pballs_bowled, int pruns_conceded ) 
	{
		name=pname;
		wickets=pwickets;
		matches=pmatches;
		balls_bowled=pballs_bowled;
		runs_conceded=pruns_conceded;
	}
	 //this method is used to calculate and print the bowling average 
	 public void computeBowlingAverage() 
	 { 
		
		if(wickets<0 ||matches<0||balls_bowled<0||runs_conceded<0)
		{
			System.out.println("Error");
		}
		else if(matches==0)
		{
			if(runs_conceded>0 ||balls_bowled>0)
			{
			System.out.println("Error");
			}
		}
		else
		{
			System.out.println("Name:"+name);
			double avg=runs_conceded/wickets;
			System.out.println("Bowling average:"+avg);
		}
	 }
	 //this method is used to calculate and print bowling strike rate
	 public void computeStrikeRate() 
	 {
		 System.out.println("Name:"+name);
		double avg=balls_bowled/runs_conceded;
		 System.out.println("Strike rate:"+avg);
	 }
	 
	 //this method is used to display bowler/batter statistics
	/* public void showStatistics() 
	 {
	     
	 }*/

	@Override
	public String toString() 
	{
		return "Bowler name=" + name + ", \nwickets=" + wickets + ", \nmatches=" + matches + ", \nballs bowled="
				+ balls_bowled + ", \nruns conceded=" + runs_conceded + ".";
	}
}

//An ELC(Executable Logic class) class with main method to test your code
public class BowlerDetails 
{
	public static void main(String[] args) 
	{
		//create new object to Bowler class
		//call bowlerDetails method by passing bowler information.
		//this step will assign values to instance variables
		//call this method to see bowling average
		// call this method to see bowling strike rate
		// call this method to see bowler/batter statistics
		Bowler B=new Bowler();
		B.bowlerDetails("Sachin",10,5,750,463);
		B.computeBowlingAverage();
		B.computeStrikeRate();
		System.out.println(B);
	}
}
