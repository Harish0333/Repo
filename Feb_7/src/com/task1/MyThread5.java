package com.task1;

class MyThread5 extends Thread
{
	public void run()
	{
	System.out.println("thread running....");
	}
	public static void main(String args[])
	{
	    Object obj=new Object();
	 //   obj.start();
	    MyThread5 obj1=new MyThread5();
	    obj1.start();
	}
}
