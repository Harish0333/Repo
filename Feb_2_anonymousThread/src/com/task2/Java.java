package com.task2;

class NITo extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
	}
}

public class Java {
	
	public static void main(String[] args) throws InterruptedException {
		for(int a = 0; a<10;a++) 
		{
		  Thread newThread = new Thread(new NITo());
		  newThread.start();
		}
    }
}