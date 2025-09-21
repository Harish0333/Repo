package com.task1;

public class SportsCar extends Car 
{
	private int topSpeed;
	public SportsCar(String brand, String model, String fuelType, int topSpeed) 
	{
		super(brand, model, fuelType);
		this.topSpeed = topSpeed;
	}
	public void performSpecialAction()
	{
		System.out.println("Quick acceleration and speed");
	}
	@Override
	public String toString() {
		return super.toString()+"SportsCar [topSpeed=" + topSpeed + "]";
	}
	
}
