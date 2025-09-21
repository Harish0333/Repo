package com.task3;

public class Main {

	public static void main(String[] args) 
	{
		NIT nit = new NIT();
		NIT1 nit1 = new NIT1();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
	}

}
