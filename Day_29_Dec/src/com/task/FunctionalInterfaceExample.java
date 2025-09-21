package com.task;

interface nit1
{
	void run();
}
public class FunctionalInterfaceExample 
{
	public static void main(String[] args) 
	{
		Runnable nit1 = () -> System.out.println("Thread Started");
		nit1.run();
	}
}
