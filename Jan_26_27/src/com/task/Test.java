package com.task;

public class Test extends Thread 
{
	@Override
	public void run()
	{
		String name=Thread.currentThread().getName();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("i value is "+i+" by "+name+" thread");
		}
	}
}
