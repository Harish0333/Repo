package com.task18;
/*2) Write a program that converts a given number of seconds to minutes, hours, or days 
     based on user input using a switch case statement in Java:*/
import java.util.Scanner;
public class Time 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of seconds to convert:");
		int time=sc.nextInt();
		System.out.println("select your choice:");
		System.out.println("1.minutes");
		System.out.println("2.hours");
		System.out.println("3.days");
		System.out.print("Enter your choice:");
		int ch=sc.nextInt();
		sc.close();
		switch(ch)
		{
		case 1:
			int min=time/60;
			System.out.println(min+" minutes");
			break;
		case 2:
			int hours=time/3600;
			System.out.println(hours+" hours");
			break;
		case 3:
			int days=time/86400;
			System.out.println(days+" days");
			break;
		default:
			System.out.println("Invalid option");
		}
	}

}
