/*Define a method which returns the greatest number among three numbers.
Write the method with the following specifications: 
Name of method : getGretest()
  Modifiers : public, static
  return type : int
  Argument : three arguments of type integer  
This accepts Three integer values as argument and return the greatest value.
Arguments: three arguments of type integer
Return Type: an integer value 
Specifications: The value returned by the method getGreatest() is determined by the following rules:
if any of the given numbers are negative, return -1.
if any of the given numbers are zero, return -2.
if the given numbers are positive, return the greatest.*/
import java.util.Scanner;
class FindGreatestValue
{	
	public static int getGreatest(int number1, int number2, int number3) 
	{
	//implement the logic according to conditions provided in problem
		if(number1<=0 ||number2 <=0 ||number3 <=0)
		{
		return -1;
		}
		else if(number1==0 ||number2 ==0 ||number3 ==0)
		{
		return -2;
		}
		else
		{
			if (number1 >= number2 && number1 >= number3) 
			{
			    return number1;
			  } 
			else if (number2 >= number1 && number2 >= number3) 
			{
			    return number2;
			  } 
			else 
			{
			    return number3;
			  }
		}
	}
}
public class GreatestOfThreeIntergers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create scanner object and read numbers from the user
		//call getGretest method by passing 3 numbers
		//display results
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int result1 = sc.nextInt();
		int result2 = sc.nextInt();
		int result3 = sc.nextInt();
		sc.close();
		int x=FindGreatestValue.getGreatest(result1,result2,result3);
		System.out.println("Greatest number:"+x);
	}
}
