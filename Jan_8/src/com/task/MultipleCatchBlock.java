package com.task;

public class MultipleCatchBlock 
{
	public void multiCatch ()
	{
		int a[]=new int[2];
		try
		{
		a [4]=10/0;
		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException |NumberFormatException e)
		{
		e.printStackTrace();
		} 
	}
	public static void main(String[] args) 
	{
		MultipleCatchBlock m=new MultipleCatchBlock();
		m.multiCatch();
	}
}
