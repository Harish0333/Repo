package com.task1;

public class MultiThread2 extends Thread
{
	public static void main(String[] args) 
	{
		MultiThread2 m1 = new MultiThread2();
		MultiThread2 m2 = new MultiThread2();
		MultiThread2 m3 = new MultiThread2();
		m1.start();
		m2.start();
		m3.start();
		for(int i=0;i<5;i++) 
		{
			m2.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
