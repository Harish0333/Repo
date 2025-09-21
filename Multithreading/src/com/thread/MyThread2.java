package com.thread;
class Test2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Child Thread is running");
	}
}

public class MyThread2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started...");
		
		Test2 t1 = new Test2();
		System.out.println("Child thread started ? "+t1.isAlive());//f
		t1.start();
		
		System.out.println("Child thread started ? "+t1.isAlive());
		

		//t1.start(); 
		//We can't restart a thread in java if we try to restart then It will generate an exception i. [java.lang.IllegalThreadStateException]
		
		System.out.println("Main thread Ended...");

	}

}

