package unchecked.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation 
{
	public static void main(String[] args) 
	{
		Scanner sc = null;
		try
		{
			sc = new Scanner(System.in);
			System.out.print("Enter your Employee Number :");
			int eid = sc.nextInt();
			System.out.println(eid);			
		}
		catch(InputMismatchException e)
		{
			System.err.println("Input is not in a proper format");
		}
		finally
		{
			sc.close();
			System.out.println("Scanner resource handled");
		}
	}
}
