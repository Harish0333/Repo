package com.task;

public class Java8 {

	public static void main(String[] args) 
	{
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Naresh I Technologies");
			}
		}).start();
		System.out.println(new Thread().isAlive());
   	}
}
