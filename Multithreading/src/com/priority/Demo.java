package com.priority;

public class Demo {
	public static void main(String[] args)  throws InterruptedException
	{
		Thread t = Thread.currentThread();
               for(int i =1; i<=10; i++)
		{
		  System.out.println(i);
		  t.join();
		}
	}

}
