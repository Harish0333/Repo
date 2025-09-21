package com.task1;

class MThread extends Thread 
{
	   public static Thread mt;

	   public void run() 
	   {
	      try 
	      {
	         mt.join();
	      } 
	      catch(InterruptedException ie) {}
	      System.out.print("Child ");
	   }
	}

	public class Test8 
	{
	   public static void main(String[] args) throws InterruptedException 
	   {
	      MThread.mt = Thread.currentThread();
	      MThread t = new MThread();
	      t.start();
	      Thread.sleep(1000);
	      //t.join();
	      System.out.print("Main ");
	   }
	}

