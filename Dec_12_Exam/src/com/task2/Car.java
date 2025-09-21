package com.task2;

public class Car 
{
	public String fuelType; 
	public String gears;
	
	public Car(String fuelType, String gears) 
	{
		super();
		this.fuelType = fuelType;
		this.gears = gears;
	}
	public void start()
	{
		System.out.println("Vehicle has been started");
	}
	public void stop()
	{
		System.out.println("Vehicle has been stopped");
	}
	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", gears=" + gears + "]";
	}
	
}
