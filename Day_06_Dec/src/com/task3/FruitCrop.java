package com.task3;

public class FruitCrop extends Crop 
{
	private String fruitType;

	public FruitCrop(String name, String plantingDate, String growthStatus, String fruitType) 
	{
		super(name, plantingDate, growthStatus);
		this.fruitType = fruitType;
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	@Override
	public String toString() 
	{
		return "\n\nFruit "+super.toString()+"\nFruit Type=" + fruitType;
	}
}
