/*Write a program in Java to input 5 numbers from keyboard and find their sum and average.
Output:
please enter 5 numbers
Enter number 1
3
Enter number 2
232
Enter number 3
33
Enter number 4
545
Enter number 5
3
Sum of the numbers: 816.0
Average of the numbers: 163.2*/
package com.day13;
import java.util.Scanner;
public class SumAndAverageNumbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create scanner object and read 5 numbers from user
		// Declare variables
		//read input from the user
		//sub and average numbers
		//display results
        //close the scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		System.out.print("Enter number 1:");
		int num1=sc.nextInt();
		System.out.print("Enter number 2:");
		int num2=sc.nextInt();
		System.out.print("Enter number 3:");
		int num3=sc.nextInt();
		System.out.print("Enter number 4:");
		int num4=sc.nextInt();
		System.out.print("Enter number 5:");
		int num5=sc.nextInt();
		double sum=num1+num2+num3+num4+num5;
		double avg=sum/5;
		sc.close();
		System.out.println("Sum of the numbers:"+sum);
		System.out.println("Average of the numbers:"+avg);	
	}
}
