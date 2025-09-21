package com.task3;
/*Design a Crop class with attributes like name, planting date, and growth status.
1.Create a class Crop

Instance variable:-

private String name;

String plantingDate,private

String growthStatus,private

Create a parameterized constructor for all Instance variable to initialize the variable.

Generate Getters for all Instance variable to get values.

Generate Setters for growthStatus variable to set values for growth status.

2.Create a subclass FruitCrop class inheriting from Crop

Instance variable:-

String fruitType,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Crop class constructor attributes.

Generate Getters for fruitType variable to get values.

3.Create a class MainCrop which contains main method to demonstrate the usage.

//Creating a Crop object using the parameterized constructor

//Creating a FruitCrop object using the parameterized constructor

// to call the method.

Output:-

Crop Name: Wheat

Planting Date: 2023-01-15

Growth Status: Growing

Fruit Crop Name: Apple

Planting Date: 2023-03-10

Growth Status: Blooming

Fruit Type: Red*/

public class MainCrop 
{
	public static void main(String[] args) 
	{
		Crop c1=new Crop("Wheat","2023-01-15", "Growing");
		FruitCrop f1=new FruitCrop("Apple", "2023-03-10", "Blooming", "Red");
		System.out.println(c1);
		System.out.println(f1);
	}
}
