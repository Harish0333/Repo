package com.task5;

public class Vehicle 
{
	private String brand;
	private String model;
	
	public Vehicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	public void start()
	{
		System.out.println("Starting the vehicle");
	}
	public void stop()
	{
		System.out.println("Stopping the vehicle");
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + "]";
	}	
}
