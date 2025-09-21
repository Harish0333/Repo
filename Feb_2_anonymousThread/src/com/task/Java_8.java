package com.task;

class NIT extends Thread
{
	public void display() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display");
			
			Thread.sleep(500);
		}
	}
}

class NIT1 extends Thread
{
	public void display1() throws InterruptedException {
		for(int a=0;a<5;a++) 
		{
			System.out.println("NIT Display1");
			
			Thread.sleep(1000);
		}
	}
}

public class Java_8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT nit = new NIT();
		NIT1 nit1 = new NIT1();
		
		nit.start();
		nit1.start();
		
		nit.display();
		nit1.display1();
    }
}