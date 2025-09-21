package com.task1;

public class Vehicle 
{
	private String brand;
	private String model;
	public Vehicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	public void startEngine()
	{
		System.out.println("car is running");
	}
	public void stopEngine()
	{
		System.out.println("car is Stopped");
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + "]";
	}
	
}
