package com.task11;

class NITy extends Thread
	{
		@Override
		public void run() 
		{
			System.out.println(currentThread().getName());
			System.out.println(currentThread().getPriority());
		}
	}
public class Javaa 
{	
	public static void main(String[] args) throws InterruptedException 
		{
			NITy nit = new NITy();
			
			nit.run();
	    }
}

