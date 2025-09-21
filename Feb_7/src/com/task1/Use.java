package com.task1;

import java.io.*;
class MyThread3 extends Thread
{
	public boolean stop=true;
	public void run()
	{
		for(int i=1;i<3;i++)
		{
		System.out.println(i);
			if(stop == false)
			{
				return;
			}
		}
	}
}
public class Use
	{
	public static void main(String args[])throws IOException
	{
	MyThread3 mt=new MyThread3();
	mt.start();
	System.out.print("Press Enter to Stop Thread :\n");
	System.in.read();
	mt.stop=false;
	}
}
