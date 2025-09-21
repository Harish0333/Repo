package com.task;

import java.util.Scanner;

/*2) Write a program to create user-defined checked exception which will accept only vowels character from the user,
 * if the character is not vowel then it should throw InvalidCharacerException with proper message.*/
public class Main2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Vowels :");
		try(sc)
		{
			char c=sc.next().charAt(0);
			c=Character.toLowerCase(c);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				throw new InvalidCharacerException("Vowel Rings");
			}
			else
			{
				System.out.println("Error input please enter vowel :"+c);
			}
		}
		catch(InvalidCharacerException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
