package com.task2;

public class Watch 
{
	String typeOfWatch;
	String brand;
	double price;
	
	public Watch(String typeOfWatch, String brand, double price) {
		super();
		this.typeOfWatch = typeOfWatch;
		this.brand = brand;
		this.price = price;
	}
	public void showTime()
	{
		
	}
	@Override
	public String toString() {
		return "[type =" + typeOfWatch + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
