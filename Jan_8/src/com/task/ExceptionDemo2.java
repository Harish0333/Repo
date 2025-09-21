package com.task;

public class ExceptionDemo2
{
	public void checkException2()
	{
		try
		{
		int a[]=new int [50];
		a[6]=20;
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
		System.out.println("Array Index Out Of Bounds");
		}
	}
	public static void main(String[] args) 
	{
		ExceptionDemo2 D=new ExceptionDemo2();
		D.checkException2();
	}
}
