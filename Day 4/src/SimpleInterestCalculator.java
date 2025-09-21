/*Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.
Ask user to provide Principal amount, Interest rate in percentage and Time in years. 
Then calculate and display Simple interest and total amount.
Output:
Enter the Principal Amount: 25000
Enter the Rate of Interest (in percentage): 18
Enter the Time (in years): 2
Simple Interest: Rs 9000.0
Total Amount: Rs 34000.0*/
import java.util.Scanner;
public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read user input
        // Prompt the user to enter principal amount
        // Prompt the user to enter the rate of interest 
        // Prompt the user to enter the time in years
        // Calculate Simple Interest
        // Calculate the Total Amount (Principal + Simple Interest)
        // Display the Simple Interest and Total Amount
        // Close the Scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal Amount:");
		int principal=sc.nextInt();
		System.out.print("Enter the Rate of Interest (in percentage):");
		int rate=sc.nextInt();
		System.out.print("Enter the Time (in years):");
		int year=sc.nextInt();
		sc.close();
		double sinterest=((principal*rate)/100)*year;
		double total=sinterest+principal;
		System.out.println("Simple Interest: Rs "+sinterest);
		System.out.println("Total Amount: Rs "+total);
	}

}
