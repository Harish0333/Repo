package com.task5;

public class MultiThread 
{
	public static void main(String[] args) 
	{
		Test nit = new Test();
		Thread thread = new Thread(nit);
		thread.setName("NareshIT");
		thread.start();
	}

}
