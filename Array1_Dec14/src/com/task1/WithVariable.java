package com.task1;
import java.util.Scanner;
/*An ordinary variable can hold only one value at a time.
Example:- int x = 10;
Que-> Write a java program to prove that the variable can store only single value or one value
      at a time?
Solution:*/
public class WithVariable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int value;
		char choice;
		do
		{
			System.out.println("Enter the element you want to store:");
			value=sc.nextInt();
			System.out.println("Enter the choice if you want to store more elements:");
			System.out.println("For Yes Press y or Y");
			System.out.println("For No Press n or N");
			choice=sc.next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
		System.out.println("The element which you had stored is:"+value);
		sc.close();
	}
}
