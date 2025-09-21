package com.task;

public class MultiThread2 
{

	public static void main(String[] args) 
	{
		nit();
	}
	
	static public void nit() 
	{
		Test test = new Test();
		test.start();

	}

}
