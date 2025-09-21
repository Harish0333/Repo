package com.task;

public class MyThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread started ");
		
		Test t1=new Test();
		t1.start();
		
		System.out.println("Main thread ended ");
	}

}
