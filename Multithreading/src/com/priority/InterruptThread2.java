package com.priority;

public class InterruptThread2
{
    public static void main(String[] args) 
	{
        Thread thread = new Thread(new MyRunnable());
        thread.start();
     
        try 
		{
            Thread.sleep(5000);  //main thread is waiting for 5 sec
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
        
        thread.interrupt();
    }
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
	{
        try 
		{
            while (!Thread.currentThread().isInterrupted())
			{
                System.out.println("Thread is running...");
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) 
		{
            System.out.println("Thread interrupted gracefully.");
        } 
		finally 
		{
            System.out.println("Thread resource can be release here.");
        }
    }
}
