package com.task1;

class MyThread1 extends Thread
{
	public void run()
	{
	System.out.println("thread running....");
	}
	public static void main(String args[])
	{
	MyThread1 obj=new MyThread1();
	obj.start();
	}
}