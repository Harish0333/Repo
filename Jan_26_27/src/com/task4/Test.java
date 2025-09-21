package com.task4;

public class Test extends Thread 
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 5; i++) 
		{	
		      //Child 1  and Chiild2	
			  try 
			  { 
				  Thread.sleep(1000); 
			  }
			  catch(Exception e) 
			  {
			   System.err.println("thread has interrupted"); 
			  }
			 	
			System.out.println(i + " by " + Thread.currentThread().getName());
		}

	}
}
