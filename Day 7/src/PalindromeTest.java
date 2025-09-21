/*
 Write a java program which print the given three-digit number is palindrome or not
Program is determined by the following rules:
if the given number is an three digit number, 
Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is palindrome
if 0 then print a message that the number is not a palindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.*/
import java.util.Scanner;
public class PalindromeTest 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// initialize Scanner object and read the number from user
		//ask user to input the number	
		//write logic to find palindrome or not
        //display results based on conditions
		//Close scanner
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int x=sc.nextInt();
		sc.close();
		int result = palindromecheck(x);

        switch (result) {
            case 1:
                System.out.println("The number is a palindrome.");
                break;
            case 0:
                System.out.println("The number is not a palindrome.");
                break;
            case -1:
                System.out.println("Invalid input. Please provide a positive three-digit number.");
                break;
            case -2:
                System.out.println("Invalid input. This program can check the operation for a three-digit number only.");
                break;
        }
	   
	}
	public static int palindromecheck(int x)
	{
		int original = x;
		int rev=0,rem;
		if(x<=0)
		{
			return -1;
		}
		if(x<=99||x>999)
		{
			return -2;
		}
	    while (x != 0) 
	    {
	       rem = x % 10;
	       rev = rev * 10 + rem;
	       x /= 10;
	    }
	    if (original == rev) 
	    {
	    	return 1;
	    }
	    else 
	    {
	    	return 0;
	    }
	}
}
