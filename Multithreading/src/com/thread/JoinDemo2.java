package com.thread;
class Alpha extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	//Alpha_Thread		
		
		Beta b1 = new Beta();
		b1.setName("Beta_Thread");
        b1.start();  
        try 
        {
			b1.join(); //Alpha thread is in Halt mode
		} 
        catch (InterruptedException e) 
        {			
			e.printStackTrace();
		}
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name);
		}	
	}
}
class Beta extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		String name = t.getName();	
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+" by "+name);
		}
		System.out.println(".............");
	}
}

public class JoinDemo2 {

	public static void main(String[] args) 
	{
		Alpha a1 = new Alpha();
		a1.setName("Alpha_Thread");
		a1.start();
	}
}

