package com.task2;

public class DigitalWatch extends Watch 
{
	public DigitalWatch(String typeOfWatch, String brand, double price)
	{
		super(typeOfWatch,brand,price);
	}

	@Override
	public String toString() {
		return "DigitalWatch " + super.toString() + "]";
	}
	@Override
	public void showTime()
	{
		System.out.println("Time : 13-12-2023 14:20");
	}
}
