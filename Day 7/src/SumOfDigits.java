/*Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:
if the given value is in between 10 and 99, return sum of it's digits. 
﻿Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1
*/
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from user
        // Prompt the user to enter a number            
        // implement the logic according to conditions       
        // Display the result       
        // Close the Scanner 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int x=sc.nextInt();
		sc.close();
		if(x>=0 &&x<=9)
		{
			System.out.println(-1);
		}
		else if(x>=10 &&x<=99)
		{
			int div=x/10;
			int mod=x%10;
			int sum=div+mod;
			System.out.println("Sum of digits :"+sum);
		}
		else if(x>99)
		{
			System.out.println(-2);
		}
		else if(x<0)
		{
			System.out.println(-3);
		}
		else {
			System.out.println("Inout not acceptable");
		}
	}

}
