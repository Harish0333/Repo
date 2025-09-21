package com.task11;

class NIT1 extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class java_8 {
	
	public static void main(String[] args) throws InterruptedException {
		NIT1 nit = new NIT1();
		NIT1 nit1 = new NIT1();
		NIT1 nit2 = new NIT1();
		nit.start();
		nit1.start();
		nit2.start();
    }
}
