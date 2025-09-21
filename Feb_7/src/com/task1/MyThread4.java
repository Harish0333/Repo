package com.task1;

public class MyThread4 implements Runnable 
{
	public void run() 
	{
	System.out.println("running...");
	}
	public static void main(String[] args) 
	{
	Thread thread = new Thread(new MyThread4());
	thread.start();
	System.out.println(thread.isDaemon());
	}

}
