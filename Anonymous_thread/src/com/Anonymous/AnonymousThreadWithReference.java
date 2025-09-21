package com.Anonymous;

public class AnonymousThreadWithReference {

	public static void main(String[] args) 
	{
		Thread t1=new Thread()
				{
					@Override
					public void run()
					{
						String name=Thread.currentThread().getName();
						System.out.println("Child :"+name);
					}
				};
		String name=Thread.currentThread().getName();
		System.out.println("Parent :"+name);
		t1.setName("Child1");
		t1.start();

	}

}
