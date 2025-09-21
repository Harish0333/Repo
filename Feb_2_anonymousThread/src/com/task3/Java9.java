package com.task3;

public class Java9 extends Thread{

	public static void main(String[] args) 
	{
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread Running");
		}
		else
		{
			System.out.println("Normal Thread Running");
		
		Java9 java = new Java9();
		Java9 java1 = new Java9(); //setDaemon
		Java9 java2 = new Java9();
		Java9 java3 = new Java9();
		
		java1.setDaemon(true);
		
		java.start();
		java1.start();
		java2.start();
		java3.start();
		}
	}

}
