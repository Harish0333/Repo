package task_19_3;
import java.util.Scanner;
/*Program-3
Define a method which returns the next multiple of 100 for the given number.
Write the method with the following specifications: 
Name of the BLC class:NextMultipleOfHundred
Name of method: getNextMultipleOfHundred()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 123, return 200.
Create an ELC class Main to test the application
*/
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(NextMultipleOfHundred.getNextMultipleOfHundred(x));
        sc.close();

	}

}
