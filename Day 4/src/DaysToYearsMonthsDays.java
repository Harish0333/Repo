/*Write a program in java to input number of days. Find and display number of years, months, and days.
Output:
Enter the number of days: 397
Years: 1
Months: 1
Days: 2*/
import java.util.Scanner;
public class DaysToYearsMonthsDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read user input
        // Prompt the user to enter the number of days
        // Calculate the number of years
        // Calculate the number of months
        // Calculate the number of days
        // Display the result
        // Close the Scanner
		Scanner sc= new Scanner(System.in);
		System.out.println("enter days:");
		int input=sc.nextInt();
		int year=input/365;
		int months=(input-365)/30;
		int days=input-365-months*30;
		sc.close();
		System.out.println("years:"+year);
		System.out.println("months:"+months);
		System.out.println("days:"+days);
	}

}
