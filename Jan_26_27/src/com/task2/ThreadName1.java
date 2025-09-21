package com.task2;

public class ThreadName1 {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		
		Thread t= Thread.currentThread();
		t.setName("Parent");
		
		t1.setName("Child 1");
		t2.setName("Child 2");
		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName()+"Running thread");
	}

}
