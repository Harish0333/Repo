package com.task5;

public class FourWheeler extends Vehicle
{
	private int yearOfManufacture;
	public FourWheeler(String brand, String model, int yearOfManufacture) {
		super(brand, model);
		this.yearOfManufacture = yearOfManufacture;
	}
	public void honk()
	{
		System.out.println("Vehicle is Horn....");
	}
	@Override
	public String toString() {
		return "FourWheeler [yearOfManufacture=" + yearOfManufacture + "," + super.toString() + "]";
	}
}
