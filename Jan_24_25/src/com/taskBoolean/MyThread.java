package com.taskBoolean;

import com.task.Test;

public class MyThread 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main thread started");
		Test t1=new Test();
		
		System.out.println("Child Thread Started :"+t1.isAlive());
		t1.start();
		System.out.println("Child Thread Started :"+t1.isAlive());
		t1.start();
		System.out.println("Main thread ended");
		
	}

}
