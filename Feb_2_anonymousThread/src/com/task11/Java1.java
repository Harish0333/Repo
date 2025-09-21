package com.task11;

class NIT2 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Java1 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		NIT2 nit = new NIT2();
		NIT2 nit1 = new NIT2();
		NIT2 nit2 = new NIT2();
		
		/*nit.setPriority(Thread.MIN_PRIORITY);
		nit1.setPriority(Thread.MIN_PRIORITY);
		nit2.setPriority(Thread.MIN_PRIORITY);*/
		
		nit.setPriority(Thread.MAX_PRIORITY);
		nit1.setPriority(Thread.MAX_PRIORITY);
		nit2.setPriority(Thread.MAX_PRIORITY);
		
		nit.start();
		nit1.start();
		nit2.start();
    }
}
