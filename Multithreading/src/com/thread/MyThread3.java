package com.thread;
import com.thread.MyThread;
public class MyThread3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started...");
		
		Test t1 = new Test();
		Test t2 = new Test();	
		
		t1.start();
		t2.start();

		System.out.println(10/0);//f
		
		System.out.println("Main thread Ended...");

	}

}

