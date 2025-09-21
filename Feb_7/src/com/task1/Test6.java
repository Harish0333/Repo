package com.task1;

class A implements Runnable
{
	public void run()
	{
		  System.out.println("run-a");
	}
}
  public class Test6
 {
	public static void main(String[] args)
	{
		A a= new A();
		Thread t= new Thread(a);
		t.start();
		t.start();
		
	}
}

