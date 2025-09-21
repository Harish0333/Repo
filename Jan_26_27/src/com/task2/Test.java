package com.task2;

public class Test extends Thread
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+"Thread is running");
	}
}
