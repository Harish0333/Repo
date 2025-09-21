package com.task3;

public class SleepDemo {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		System.out.println("Main Thread Started ");
		t1.start();
		System.out.println("Main thread ended");

	}

}
