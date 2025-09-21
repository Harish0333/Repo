package com.task18;
/*3) Write a program on user input number converted into respective digit in figures
using switch case example:
Input: 123
Output: ONE TWO THREE*/
import java.util.Scanner;
public class Digitspellig 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int x=sc.nextInt();
		int temp=x;
		int digit;
		int rev=0;
		sc.close();
		while(temp>0)
		{
			digit=temp%10;
			temp=temp/10;
			rev=rev*10+digit;
		}
		while(rev>0)
		{
			digit=rev%10;
			switch(digit)
			{
			case 0:
				System.out.print(" "+"ZERO");
                break;
            case 1:
            	System.out.print(" "+"One");
                break;
            case 2:
            	System.out.print(" "+"TwO");
                break;
            case 3:
            	System.out.print(" "+"Three");
                break;
            case 4:
            	System.out.print(" "+"Four");
                break;
            case 5:
            	System.out.print(" "+"Five");
                break;
            case 6:
            	System.out.print(" "+"Six");
                break;
            case 7:
            	System.out.print(" "+"Seven");
                break;
            case 8:
            	System.out.print(" "+"eight");
                break;
            case 9:
            	System.out.print(" "+"nine");
                break;
            default:
                System.out.println("Invalid digit");
			}
			rev/=10;
		}
	}
}
