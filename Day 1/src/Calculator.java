/*
Write a program to perform addition, subtraction, multiplication and division between two numbers using 3rd variable.
Perform Addition, Subtraction, Multiplication and Division calculation sequentially when user provides Two numbers. 
Use third variable to store and print the result.

Example 1:
Input:
Define variable number 1 to : 5
Define variable number 2 to: 6
Output:
Addition Result: 11.0
Subtraction Result: -1.0
Multiplication Result: 30.0
Division Result: 0.8333333333333334

Example 2:
If you define variable number2 to zero then display “Division by zero is not allowed” for division calculation.
Input:
Define variable number 1 to : 6
Define variable number 2 to: 0
Output:
Addition Result: 6.0
Subtraction Result: 6.0
Multiplication Result: 0.0
Division by zero is not allowed.*/
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Input:");
		System.out.print("Enter number 1:");
		float a=sc.nextFloat();
		System.out.print("Enter number 2:");
		float b=sc.nextFloat();
		sc.close();
		float c=(a+b);
		System.out.println("Addition:"+c);
		c=(a-b);
		System.out.println("Subtraction:"+c);
		c=(a*b);
		System.out.println("Multiplication:"+c);
		c=(a/b);
		if(a>=1 && b==0)
		{
			System.out.println("Division:"+"Division by zero is not allowed");	
		}
		else
		{
			System.out.println("Multiplication:"+c);
		}
	}

}
