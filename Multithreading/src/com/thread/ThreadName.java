package com.thread;
class Test9 extends Thread
{
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread is running Here!!!!");
	}
}
public class ThreadName 
{
	public static void main(String[] args) 
	{
		Test9 t1 = new Test9(); 
		Test9 t2 = new Test9(); 
		t1.start();			
		t2.start();	
	System.out.println(Thread.currentThread().getName()+" thread is running.....");
	}
}
