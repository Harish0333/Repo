package com.task1;

class AscendingAndDescendingThreads extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
		System.out.println("run: "+i);
		}
	}
}

class TestAD
{
	public static void main (String []args)
	{
		for(int i=3;i<=5;i++)
		{
		System.out.println( "main: "+i);
		}
	}	
}

