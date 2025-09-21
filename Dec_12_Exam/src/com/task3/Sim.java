package com.task3;

public class Sim 
{
	public String size;
	public String color;
		
	public Sim(String size, String color) 
	{
		super();
		this.size = size;
		this.color = color;
	}
	public void call()
	{
		System.out.println("Caling....");
	}
	public void sms()
	{
		System.out.println("Msg....");
	}
	@Override
	public String toString() {
		return "Sim [size=" + size + ", color=" + color + "]";
	}
	
}
