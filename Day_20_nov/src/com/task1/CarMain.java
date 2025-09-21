package com.task1;
/*Create a Java class named Car with following attributes:
 private String brand
 private String model
 private int year and
 private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.

Create a Driver class and the class should have following attributes:
private String name and
private int age 
Implement a parameterized constructor to initialize all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.

Create a Main class that creates a Car object and sets its attributes and the attributes of its driver. 
Then, create a copy of the Car object using the copy constructor and print the attributes of both the original and 
the copy of the Car objects to confirm that the copy constructor works correctly.
Finally, use the changeDriver() method to change the driver of the original Car object, 
and print the attributes of both the original and the copy of the Car objects again to confirm that 
the copy constructor created a deep copy of the Driver object and that the changeDriver method 
did not affect the driver of the copy of the Car object.*/
public class CarMain 
{
	public static void main(String[] args) 
	{
		// Create an object to Driver class with driver name and age;
		Driver originalDriver= new Driver("Johnny",28);
		// create an object to Car class with car model, type, year and driver
		Car originalCar=new Car("BMW","7 series",2022,originalDriver);
		// assume that this is a original car
		//create an object car class as copyCar by passing original car object reference as parameter
		Car copyCar=new Car(originalCar);
		
		//print both car and copy car details
		System.out.println("Before changing the drivers:");
		System.out.println(originalCar);
		System.out.println(copyCar);
		//create new driver with different name and age.
		Driver D1= new Driver("Steve",30);
		//call change driver method by using original car's object reference to change the driver.
		originalCar.changeDriver(D1);
		copyCar.changeDriver(D1);
		//print both car and copy car details
		System.out.println("After changing the drivers:");
		System.out.println(originalCar);
		System.out.println(copyCar);
	}
}
