package com.task1;

class DaemonTest extends Thread  
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
		System.out.println("Daemon thread is running");
		}
		else
		{
		System.out.println("Not Running");
		}
	}
	public static void main(String[] args) 
	{
	DaemonTest obj = new DaemonTest();
	obj.setDaemon(true);
	obj.start();
	
	}
}

