package com.task5;

public class Test implements Runnable {

	@Override
	public void run() 
	{
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();
		System.out.println(nit.getName());
		
	}

}
