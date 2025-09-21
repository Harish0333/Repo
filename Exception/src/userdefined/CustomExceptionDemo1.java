package userdefined;

import java.util.Scanner;

public class CustomExceptionDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc)
		{
			System.out.print("Enter your Age :");
			int age = sc.nextInt();
			
			if(age<18)
			{
			  throw	new InvalidAgeException("Age is Invalid");
			}
			
			else
			{
				System.out.println("Go for a movie");
			}
		}
		catch(InvalidAgeException e)
		{
			e.printStackTrace();
		}
	}
}
