package com.task;

public class Test extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running");
	}
}
