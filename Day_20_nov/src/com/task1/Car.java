package com.task1;
/*Create a Java class named Car with following attributes:
private String brand
private String model
private int year and
private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.*/
public class Car 
{
	//Declare instance variables
	private String brand;
	private String model;
	private int year;
	private Driver driver;
	 //create a constructor to initialize instance variables
	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	// create a constructor with Car as a parameter and initialize instance variables;
	public Car(Car otherCar)
	{
		this.brand = otherCar.brand;
		this.model = otherCar.model;
		this.year = otherCar.year;
		this.driver = otherCar.driver;
	}
	 //create a method called changeDriver(). parameter is of type Driver. return type void.
	 // this method changes current driver to new driver
	public void changeDriver(Driver newdriver)
	{
		this.driver=newdriver;
	}
	 // create getters and setters for all instance variables
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	//override toString method
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}	
}
