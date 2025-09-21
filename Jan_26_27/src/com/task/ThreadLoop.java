package com.task;

public class ThreadLoop 
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		System.out.println("Main thread started");
		t1.start();
		String name=Thread.currentThread().getName();
	    
		for(int i = 1; i<=5; i++)
	    {
	    System.out.println("i value is :"+i+" by "+name+ " thread");	   
	    }	
		
		int x=1;
		do
		{
			System.out.println("Hello");
			x++;
		}
		while(x<=5);
	}

}
