package com.task;

class Test5 extends Thread
{
	public void run()
	{
		for(int i=0; i<=3; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
public class NewPlatForm1
{
	public static void main(String[] args) 
	{
		Test5 t = new Test5();
		t.start();
		Test5 t2= new Test5();
		t2.start();
	}
}