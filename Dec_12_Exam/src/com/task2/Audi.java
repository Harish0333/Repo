package com.task2;

public class Audi extends Car 
{
	public String color;
	public int carNo;
	
	public Audi(String fuelType, String gears, String color, int carNo) 
	{
		super(fuelType, gears);
		this.color = color;
		this.carNo = carNo;
	}
	@Override
	public void start()
	{
		System.out.println("Vehicle Audi has been started ");
	}
	@Override
	public void stop()
	{
		System.out.println("Vehicle Audi has been stopped ");
	}
	@Override
	public String toString() {
		return "Audi [color=" + color + ", carNo=" + carNo + "," + super.toString() + "]";
	}
	
}
