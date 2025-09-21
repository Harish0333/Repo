package com.task;

public class MultiThread implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MultiThread());
		thread.start();
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("NareshIT");
	}

}
