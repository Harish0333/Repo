package com.task1;

public class Car extends Vehicle 
{
	private String fuelType;
	public Car(String brand, String model, String fuelType) 
	{
		super(brand, model);
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return super.toString()+ "Car [fuelType=" + fuelType + "]";
	}	
	
}
