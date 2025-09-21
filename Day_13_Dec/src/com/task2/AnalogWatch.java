package com.task2;

public class AnalogWatch extends Watch 
{
	public AnalogWatch(String typeOfWatch, String brand, double price)
	{
		super(typeOfWatch,brand,price);
	}

	@Override
	public String toString() {
		return "AnalogWatch " + super.toString() + "]";
	}
	@Override
	public void showTime()
	{
		System.out.println("Time :10:20");
	}
}
