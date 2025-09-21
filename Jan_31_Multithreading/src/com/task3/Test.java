package com.task3;

public class Test extends Thread 
{
	int a;
	@Override
	public void run() 
	{
		a++;
	}
}
