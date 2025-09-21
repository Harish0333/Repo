package com.thread;
class Foo2 implements Runnable
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Child Thread is running :"+name);		
	}	
}
public class RunnableDemo 
{
	public static void main(String[] args) 
	{
	   Foo2 f1 = new Foo2();
	   
	   Thread t1 = new Thread(f1);
	   t1.start();   
	}
}
