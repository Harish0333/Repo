package com.task;
import java.lang.ArithmeticException;
public class Handling 
{
	 static void nit(int x) 
	{
		try 
		{
			System.out.println("Naresh");
			nit1(x);
			System.out.println("I");
		}
		catch(Exception e)
		{
			System.out.println("Catch block in Handling");
		}
	}
	 static void nit1(int x) throws Exception
	{
		try
		{
			int a=2/x;
			System.out.println(a);
			System.out.println("nit1 Completed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont provide Zero as parameter");
		}
		finally
		{
			System.out.println("Finally");
		}
	}
}
