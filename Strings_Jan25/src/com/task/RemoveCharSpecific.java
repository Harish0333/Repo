package com.task;
//Write a program to remove a specified character from the given String.
import java.util.Scanner;

public class RemoveCharSpecific 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		
		System.out.println("Enter the character to remove:");
		char remove=sc.next().charAt(0);
		
		StringBuilder sb=new StringBuilder();
		for(char result:str.toCharArray())
		{
			if(result!=remove)
			{
				sb.append(result);
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
