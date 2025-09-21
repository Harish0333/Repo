/*Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, 
 then round off it's value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5,
 then round off to the next multiple of 10. 
Write the method with the following specifications: 
Name of the BLC class:RoundedSum
Name of method: sumOfRoundedValues() 
Access Modifier : public, static
Arguments: three argument of type integer
Return type: int
This method accepts three integer values as argument and return the sum of three rounded numbers.
Example
if a = 23, b = 34, c = 66
  20 + 30 + 70 = 120
if a = 23, b = 37, c = 55
  20 + 40 + 60 = 120
Arguments: three argument of type integer
Return Type: an integer value 
Specifications: The value returned by the method sumOfRoundedValues() is determined by the following rules:
if any of the given number is negative or zero, return -1.
if any of the given numbers right most digit is of the number is less than 5, 
then round off it's value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, 
then round off to the next multiple of 10.*///import required classes and/or packages
import java.util.Scanner;
class RoundedSum 
{
	static int sumOfRoundedValues(int num1, int num2, int num3) 
	{
		//implement logic according to conditions provided in assignment
		 if (num1 <= 0 || num2 <= 0 || num3 <= 0) 
		 {
	            return -1;
	        }
		 int a= NearestMultiple(num1);
		 //System.out.print("a="+a);
		 int b=NearestMultiple(num2);
		 //System.out.print("b="+b);
		 int c=NearestMultiple(num3);
		 System.out.print(+a+"+"+b+"+"+c);
		 return a+b+c;
	}
	static int NearestMultiple(int number)
	{
		 int rightmostDigit = number % 10;
	        if (rightmostDigit < 5) {
	            return number - rightmostDigit;
	        } else {
	            return number + (10 - rightmostDigit);
	        }
	}
}
public class SumOfRoundedIntegers {
	public static void main(String args[]) {
		//create Scanner object and read 3 integer values from user
		//call the method by passing the integer values
		//display results
		//Close scanner
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value number: ");
        int a = sc.nextInt();
        System.out.print("Enter b value number: ");
        int b=sc.nextInt();
        System.out.print("Enter c value number: ");
        int c=sc.nextInt();
        int result=RoundedSum.sumOfRoundedValues(a,b,c);
        System.out.print("="+result);
        sc.close();	
	}
}
