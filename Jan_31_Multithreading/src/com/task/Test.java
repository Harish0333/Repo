package com.task;

public class Test extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() 
	{
		System.out.println("Start");
		super.start();
	}
}
