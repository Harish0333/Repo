/*Define a method which returns the difference of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsDifference
Name of method: getDiffOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 83, 8 - 3 return 5. If x = 38, 3 - 8 return -5.
Create an ELC class Main to test the application
Output 1:
Please provide two digit number
34
-1
Output 2:
Please provide two digit number
231
Please provide number from 10 to 99
*///import required classes and/or packages
import java.util.Scanner;
class TwoDigitsDifference
{
	public static int getDiffOfDigits(int num) 
	{
		 if (num >= 10 && num <= 99) 
		 	{
	            int tens = num / 10;
	            int ones = num % 10;
	            return tens - ones;
	        } 
		else{
	            return Integer.MIN_VALUE;
	        }
	}
}
public class DifferenceOfTwoDigits
{
	public static void main(String args[]) 
	{
		//create Scanner object and read a number from the user
		//Close scanner
		//write a condition to verify if the number is in between 10 to 99. 
		//if not then display message to provide two digit number.
		// else Call the method to find the difference of digits of a two digit number
		//display results
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any number: ");
	        int x = sc.nextInt();
	        sc.close();
	        int result = TwoDigitsDifference.getDiffOfDigits(x);
	        if (result == Integer.MIN_VALUE) 
	        {
	            System.out.println("Please provide number two digit number.");
	        } 
	        else
	        {
	            System.out.println(result);
	        }       
	}
}
