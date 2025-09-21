package com.task5;

public class TwoWheeler extends Vehicle 
{
	private int yearOfManufacture;
	public TwoWheeler(String brand, String model, int yearOfManufacture) {
		super(brand, model);
		this.yearOfManufacture = yearOfManufacture;
	}
	public void honk()
	{
		System.out.println("Vehicle is Horn....");
	}
	@Override
	public String toString() {
		return "TwoWheeler [yearOfManufacture=" + yearOfManufacture + "," + super.toString() + "]";
	}	
}
