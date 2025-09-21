package com.task;

public class Java8_ extends Thread{

	public void display() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display");
		}
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1");
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{		
		Java8_ java = new Java8_();
		java.start();
		java.display();
		//java.wait();
		//java.sleep(1000);
		java.display1();
    }

}
