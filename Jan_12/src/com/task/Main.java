package com.task;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Enter aadhar no:");
		Scanner sc=new Scanner(System.in);
		
		try(sc)
		{
			String s=sc.next();
			if(s.length()!=12)
			{
				throw new InvalidAadharException("Invalid number.");
			}
			else
			{
				System.out.println("Entered Aadhar number is valid.");
			}
		}
		catch(InvalidAadharException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
