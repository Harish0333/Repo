package com.task3;

public class Jio extends Sim 
{
	public Jio(String size, String color) 
	{
		super(size, color);
	}
	@Override
	public void call()
	{
		System.out.println("Calling....");
	}
	@Override
	public void sms()
	{
		System.out.println("Msg....");
	}	
}
