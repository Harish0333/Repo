package com.Anonymous;

public class AnonymousInnerClassWithRunnable {

	public static void main(String[] args) 
	{
		String name = Thread.currentThread().getName();
		System.out.println("Thread name is :"+name);
		Runnable r1 = new Runnable()
		{
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Thread name is :"+name);
			}			
		};
		
		Thread t1=new Thread(r1,"Child1");
		t1.start();
	}

}
