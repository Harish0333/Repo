package com.task1;

class MyThread7 extends Thread 
{
	   public void run() 
	   {
	      System.out.print("Child ");
	   }
}

public class Test7 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   MyThread7 t = new MyThread7();
	   t.start();
	   t.join();
	   System.out.print("Main ");
	}
}