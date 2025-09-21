package com.task3;

public class NIT1 implements Runnable 
{
	@Override
	public void run() {
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2 "+a);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}
