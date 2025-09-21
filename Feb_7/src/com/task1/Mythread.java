package com.task1;

class Mythread extends Thread 
{
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			try
			{
			Thread.sleep(2000);//two second
			System.out.println(i);
			}
			catch(InterruptedException ie)
			{
			ie.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
	Mythread mt=new Mythread();
	mt.start();
	}
}
