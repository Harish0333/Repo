/*Define a method which returns the sum of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsSum
Name of method: getSumOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: int
This method accepts an integer value as argument and return the sum of it's digits.
Specifications: The value returned by the method getSumOfdigits() is determined by the following rules:
if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, return 7
if the given value is negative, return -3
if the given value is greater than 99, return -2
if the given value is in between 0 and 9, return -1*/
import java.util.Scanner;
class TwoDigitsSum{
	public static int getSumOfDigits(int number) {
		//implement the logic according to conditions provided in assignment
		if (number >= 10 && number <= 99) 
		{
            // Calculate the sum of digits
            int digit1 = number % 10;
            int digit2 = number / 10;
            return digit1 + digit2;
        } else if (number < 0) {
            // Return -3 for negative numbers
            return -3;
        } else if (number > 99) {
            // Return -2 for numbers greater than 99
            return -2;
        } else if (number >= 0 && number <= 9) {
            // Return -1 for numbers between 0 and 9
            return -1;
        } else
        {
            // In case none of the conditions are met (should not happen)
            return 0;
        }
}
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from user
        // Prompt the user to enter a number
        // implement the logic according to conditions
        // Display the result
        // Close the Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int result1 = sc.nextInt();
		int x=getSumOfDigits(result1);
        int result2 = sc.nextInt();
        int y=getSumOfDigits(result2);
        int result3 = sc.nextInt();
        int z=getSumOfDigits(result3);
        int result4 = sc.nextInt();
        int a=getSumOfDigits(result4);
        sc.close();
        
        System.out.println("Result 1: " + x); 
        System.out.println("Result 2: " + y); 
        System.out.println("Result 3: " + z);
        System.out.println("Result 4: " + a);
	}
}
}
