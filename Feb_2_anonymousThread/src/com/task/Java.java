package com.task;

class NIT0 extends Thread
{
	@Override
	public void run() 
	{
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");
			
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class NIT2 extends Thread
{
	@Override
	public void run() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Java {
	
	public static void main(String[] args) throws InterruptedException {
		NIT0 nit = new NIT0();
		NIT2 nit1 = new NIT2();
		
		nit.start();
		nit1.start();
    }
}
