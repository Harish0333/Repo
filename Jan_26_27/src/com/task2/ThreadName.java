package com.task2;

public class ThreadName 
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"Thread is running");
	}
}
