package com.task4;

public class SleepDemo1 {

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName()+"Thread");
		
		Test t1=new Test();
		Test t2=new Test();
		
		t1.setName("Child 1");
		t2.setName("Child 2");
		
		t1.start();
		t2.start();
	}

}
