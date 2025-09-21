package com.task11;

class NIT0 extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getPriority());
	}
}

public class Java {
	
	public static void main(String[] args) throws InterruptedException {
		NIT0 nit = new NIT0();
		NIT0 nit1 = new NIT0();
		NIT0 nit2 = new NIT0();
		
		nit.setPriority(Thread.NORM_PRIORITY);
		nit1.setPriority(Thread.NORM_PRIORITY);
		nit2.setPriority(Thread.NORM_PRIORITY);
		
		nit.start();
		nit1.start();
		nit2.start();
    }
}

