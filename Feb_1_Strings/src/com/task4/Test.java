package com.task4;

public class Test extends Thread 
{
	public static synchronized void Print(int min,int max)
	{
		for(int i=min;i<=max;i++)
		{
			System.out.println(i);
			   try
	    	   {
	    		   Thread.sleep(500);
	    	   }
	    	   catch(Exception e)
	    	   {	    	
	    		   System.err.println("Thread is Interrupted...");
	    	   }
		}
	}
}
