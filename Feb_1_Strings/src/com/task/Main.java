package com.task;

public class Main {

	public static void main(String[] args) 
	{
		Test t1=new Test();
		Test t2=new Test();
		
		Thread th1=new Thread(t1)
				{
					@Override
					public void run()
					{
						t1.Print(1,10);
					}
				};
		Thread th2=new Thread(t2)
				{
					@Override
					public void run()
					{
						t2.Print(10,20);
					}
				};		
		th1.start();
		th2.start();
	}

}
