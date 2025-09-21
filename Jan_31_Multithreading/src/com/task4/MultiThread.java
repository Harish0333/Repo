package com.task4;

public class MultiThread 
{
	public static void main(String[] args) 
	{
		Test nit = new Test();
		Thread thread = new Thread(nit);
		thread.start();
	}
}
