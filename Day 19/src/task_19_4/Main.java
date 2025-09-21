package task_19_4;
/*Program-4
Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, then round off its value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, and then round off to the next multiple of 10. 
Write the method with the following specifications: 
Name of the BLC class:RoundedSum
Name of method: sumOfRoundedValues() 
Access Modifier : public, static
Arguments: three argument of type integer
Return type: an integer value 
For example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
Note:Don't use any control statements and looping statements
Create an ELC class Main to test the application*/
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value number: ");
        int a = sc.nextInt();
        System.out.print("Enter b value number: ");
        int b = sc.nextInt();
        System.out.print("Enter c value number: ");
        int c = sc.nextInt();
        System.out.println(RoundedSum.sumOfRoundedValues(a,b,c));
        sc.close();
	}

}
