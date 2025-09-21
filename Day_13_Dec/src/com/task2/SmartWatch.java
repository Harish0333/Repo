package com.task2;
//import java.time.*;
//import java.time.format.*;
public class SmartWatch extends Watch 
{
	public SmartWatch(String typeOfWatch, String brand, double price)
	{
		super(typeOfWatch,brand,price);
	}

	@Override
	public String toString() {
		return "SmartWatch " + super.toString() + "]";
	}
	@Override
	public void showTime()
	{
		System.out.println("Time : 13-12-2023 10:20 IST");
	//	System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	//	System.out.println(LocalTime.now());
	}
}
