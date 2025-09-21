package com.task2;

public class BMW extends Car 
{
	public String color;
	public int carNo;
	
	public BMW(String fuelType, String gears, String color, int carNo) 
	{
		super(fuelType, gears);
		this.color = color;
		this.carNo = carNo;
	}
	@Override
	public void start()
	{
		System.out.println("Vehicle BMW has been started ");
	}
	@Override
	public void stop()
	{
		System.out.println("Vehicle BMW has been stopped ");
	}
	@Override
	public String toString() {
		return "BMW [color=" + color + ", carNo=" + carNo + "," + super.toString() + "]";
	}
	
}
