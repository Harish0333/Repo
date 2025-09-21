/*Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:
if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.*/
import java.util.Scanner;
public class NextMultipleOfHundred 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create scanner object and ask user to input the number		
		//write a logic to find next multiple of hundred
		//display results
		//close scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = sc.nextInt();
        sc.close();
        // Calculate and print the next multiple of 100
        int result = calculateNextMultiple(Num);
        System.out.println("The next multiple of 100 is: " + result);
	}
	 private static int calculateNextMultiple(int number) {
	        // Check if the given value is negative or zero
	        if (number <= 0) 
	        {
	            return -1;
	        }
	        int remainder = number % 100;
	        int nextMultiple = number + (100 - remainder);
	        return nextMultiple;
	 }
}
