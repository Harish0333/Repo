package com.task;

public class ExceptionDemo3 
{
	public void checkException3()
	{
	try
	{
	int num=Integer.parseInt("xyz");
	System.out.println(num);
	}
	catch (NumberFormatException e)
	{
	System.out.println("Number Format Exception Occured");
	}
	}
	public static void main(String[] args) 
	{
		ExceptionDemo3 D=new ExceptionDemo3();
		D.checkException3();
	}

}
