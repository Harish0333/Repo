package trywith.resource;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{			
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			System.out.println("Your Age is :"+age);
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input Mismatched Exception");
			
		}
		System.out.println("Reached Destination");

	}
}
