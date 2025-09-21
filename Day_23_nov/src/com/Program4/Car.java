package com.Program4;
/*Create a class Car with instance variables make, model, and year. 
 * Implement an instance block that initializes the instance variables to empty strings and 0 for year. 
 * Implement a parameterized constructor that sets the instance variables make, model,and year.
 * Implement an instance method getDescription() that returns a string with the format "{make} {model} ({year})".

 Create a Car object with make "Kia", model "Seltos", and year 2023 and call the getDescription() method on it.
 Expected output:  Kia Seltos 2023*/
public class Car 
{
	String make;
	String model;
	int year;
	
	{
		make="";
		model="";
		year=0;			
	}
	
	public Car(String make, String model, int year) 
	{
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getDescription()
	{
		return make + " " + model + " " + year ;
	}
	public static void main(String[] args) 
	{
		Car c1=new Car("Kia","Seltos",2023);
		System.out.println(c1.getDescription());
	}
}
