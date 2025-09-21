package task_19;
/*Program-1
Define a method which returns the sum of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsSum
Name of method: getSumOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 34, return 7
Create an ELC class Main to test the application*/
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		System.out.println(TwoDigitsSum.getSumOfDigits(x));
		sc.close();
	}
}
