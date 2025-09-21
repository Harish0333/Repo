package com.task1;

public class Test implements Runnable 
{
	@Override
	public void run() 
	{
		Thread thread = Thread.currentThread();
		thread.stop();
		System.out.println(thread.getState());
		
	}
}