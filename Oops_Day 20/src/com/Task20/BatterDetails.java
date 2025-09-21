package com.Task20;
//BLC(Business Logic Class) called Bowler
/*Class Batter is given to you. Add below details to the class

 1. Instance variables:

 name: private -String,

 runs: private-int,

 matches: private-int,

 batting_avg: private-float.

2.  Method batterDetails() : public void

Create a method name called batterDetails() that accepts name, runs, matches.

Method name: batterDetails

Return type: void

 3. Create below public methods,

 Method name: computeBattingAverage

 Return type: void

 This method should print the batting average of the batter by dividing run with matches.

 Input: 

Name: "Sachin"

Runs: 18000

Matches: 463

 Output:

 Name: Sachin

 Batting_Avg: 38.87689

 Note: a. If runs or matches values are negative print 'Error'.

 b. If runs are greater than 0 when matches are 0 print 'Error'.

 Method name: getStatistics

 Return type: void

 This method should print the details of the batter.

 Input: 

Name: "Sachin"

Runs: 18000

Matches: 463

 Output:

 Name: Sachin

 Runs: 18000

 Matches: 463

 Note: a. If runs or matches values are negative print 'Error'.

 b. If runs are greater than 0 when matches are 0 print 'Error'.

 Given an ELC(Executable Logic class) class for Testing that contains main method. Use this class to test your code.
*/
class Batter
{
	//declare instance variables
	private String name;
	private int runs;
	private int matches;
	private float batting_avg;
	
	//this method is used to assign values to instance variables
	public void batterDetails(String bname, int bruns, int bmatches) 
	{
		name=bname;
		runs=bruns;
		matches=bmatches;
	}
	
	//This method is used to calculate batting average. use logic provided in question.
	public void computeBattingAverage() 
	{
	 batting_avg=runs/matches;
	 System.out.println("Name:"+name);
	 
	 if(runs<0 || matches<0)
	 {
		 System.out.println("Error");
	 }
	 else if(matches==0)
	 {
		 if(runs>0)
		 {
			 System.out.println("Error");
		 }
	 }
	 else
	 {
		 System.out.println("Batting avg:"+batting_avg);
	 }
	}

	@Override
	public String toString() {
		return "Batter name=" + name + ", \nruns=" + runs + ", \nmatches=" + matches + ", \nbatting avg=" + batting_avg
				+ ".";
	}
	
	// this method is used to display statistics of a batter/bowler
	/*public void getStatistics() 
	{
		
		
	}*/
}
public class BatterDetails 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// create an object to Batter class 
		//call batterDetails method by passing Batter name, runs and number of matches he/she played
		//call computeBattingAverage method to get the batting average
		//call getStatistics method to display Batter/Bowler details
		Batter b=new Batter();
		b.batterDetails("Sachin",18000,463);
		b.computeBattingAverage();
		System.out.println(b);			
	}
}
