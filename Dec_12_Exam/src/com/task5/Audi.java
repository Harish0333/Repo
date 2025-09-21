package com.task5;

public class Audi extends FourWheeler 
{

	public Audi(String brand, String model, int yearOfManufacture) 
	{
		super(brand, model, yearOfManufacture);
	}
	@Override
	public void start()
	{
		System.out.println("Starting the vehicle");
	}
	@Override
	public void stop()
	{
		System.out.println("Stopping the vehicle");
	}
	@Override
	public void honk()
	{
		System.out.println("Vehicle is Horn....");
	}
	@Override
	public String toString() {
		return "Audi " + super.toString() + "]";
	}
}
