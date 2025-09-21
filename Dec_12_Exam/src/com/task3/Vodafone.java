package com.task3;

public class Vodafone extends Sim 
{
	public Vodafone(String size, String color) 
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
