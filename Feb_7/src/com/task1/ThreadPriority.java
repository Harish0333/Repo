package com.task1;

public class ThreadPriority extends Thread 
{

	public void run()
	{
	System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) throws InterruptedException 
	{	
	ThreadPriority t1 = new ThreadPriority();
	ThreadPriority t2 = new ThreadPriority();
	
	t1.start();
	t2.start();
	
	}
}

