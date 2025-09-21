package com.task3;

public class NIT implements Runnable {

	@Override
	public void run() {
		for(int a=0;a<10;a++)
		{
			System.out.println("NareshIT1 "+a);
			try {
				 Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("NIT Thread failed");
			}
		}
		
	}

}
