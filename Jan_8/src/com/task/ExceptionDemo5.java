package com.task;

public class ExceptionDemo5 
{
	public void checkException5()
	{
	try
	{
	String str=null;
	System.out.println(str.length());
	}
	catch(NullPointerException e)
	{
	System.out.println("Null Pointer Exception");
	}
	}
	public static void main(String[] args) 
	{
		ExceptionDemo5 D=new ExceptionDemo5();
		D.checkException5();
	}
}
