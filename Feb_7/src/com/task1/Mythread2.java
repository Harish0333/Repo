package com.task1;

class Mythread2 extends Thread
{
	public void run()
	{
	for(int i=0;i<=3;i++)
	System.out.println(i);
	}
	public static void main(String[] args)
	{
	Mythread2 obj =new Mythread2();
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	t1.setPriority(2);
	t2.setPriority(Thread.NORM_PRIORITY);
	t1.start();
	t2.start();
	}
}
