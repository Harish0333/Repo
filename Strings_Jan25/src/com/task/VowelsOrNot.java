package com.task;
//Write a program to check whether a String contains vowels or not.
import java.util.Scanner;

public class VowelsOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		
		boolean containsvowel=false;
		
		for(char c:str.toLowerCase().toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				containsvowel=true;
				break;
			}
		}
		if (containsvowel)
		{
			System.out.println("Contains vowels");
		}
		else
		{
			System.out.println("No vowels");
		}
		sc.close();
	}
}
