/*Define a method which returns the next multiple of 100 for the given number.
Write the method with the following specifications: 
Name of the BLC class:NextMultipleOfHundred
Name of method: getNextMultipleOfHundred()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 123, return 200.
if the given value is negative or zero, return -1
Create an ELC class Main to test the application*///import required classes and/or packages
import java.util.Scanner;
class NextMultipleOfHundred{
	static int getNextMultipleOfHundred(int number) {
		if (number <= 0) 
        {
            return -1;
        }
        int remainder = number % 100;
        int nextMultiple = number + (100 - remainder);
		return nextMultiple;
	}
}
public class NextMultipleHundred {
	public static void main(String args[]) {
		//create Scanner object and read a number from the user
		//Close scanner
		//Call the method to find next multiple of an hundred by passing the user provided number
		//display results
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = sc.nextInt();
        sc.close();
        int result = NextMultipleOfHundred.getNextMultipleOfHundred(Num);
        System.out.println("The next multiple of 100 is: " + result);
		
	}

}
