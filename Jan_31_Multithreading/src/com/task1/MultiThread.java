package com.task1;

public class MultiThread implements Runnable 
{
	Thread thread;
	public MultiThread() 
	{
		//thread = new Thread(this);//thread-0
		thread = new Thread(this,"Naresh-IT");//
		thread.setPriority(6);
		thread.start();
	}
	@Override
	public void run() 
	{
		System.out.println(thread);
		
	}	
	public static void main(String[] args) 
	{
		new MultiThread();
	}
}
