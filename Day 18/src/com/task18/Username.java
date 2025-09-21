package com.task18;
/*Write a program in java to accept username (String) from Scanner class, 
  based on the input check the different username using switch case in java*/
import java.util.Scanner;
public class Username 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user = sc.nextLine();
        sc.close();
        switch (user.toLowerCase()) 
        {
            case "admin":
                System.out.println("Welcome, Admin!!!");
                break;
            case "user":
                System.out.println("Hello, User!");
                break;
            case "guest":
                System.out.println("Greetings, Guest!");
                break;
            default:
                System.out.println("Invalid username. Please check your input.");
        }
	}
}
