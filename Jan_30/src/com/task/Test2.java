package com.task;

public class Test2 extends Thread 
{
	static String name = "ravi";
	
	public static void main(String args[]) 
	{
		Test2 t = new Test2();
		t.Test2(name);
		System.out.print(" " + name);
	}
		
		public void Test2(String name)
		{
		start();
		System.out.print(" method");
		}
		
		public void run() 
		{
		System.out.print(" run");
		}
}

