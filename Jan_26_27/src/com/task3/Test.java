package com.task3;

public class Test extends Thread 
{
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i is value is :"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				System.err.println("Catch block :"+e);
			}
		}
	}
}
