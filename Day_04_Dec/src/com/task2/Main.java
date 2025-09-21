package com.task2;
/*Create a Java class named Car with following attributes:
 private String brand
 private String model
 private int year and
 private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and  initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.

Create a Driver class and the class should have following attributes:
 private String name and
 private int age 
Implement a parameterised constructor to initialise all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.

Create a Main class that creates a Car object and sets its attributes and the attributes of its driver. 
Then, create a copy of the Car object using the copy constructor and print the attributes of both the original and 
the copy of the Car objects to confirm that the copy constructor works correctly.
Finally, use the changeDriver() method to change the driver of the original Car object, and print the attributes of both the original and 
the copy of the Car objects again to confirm that the copy constructor created a deep copy of the Driver object and 
that the changeDriver method did not affect the driver of the copy of the Car object.
*/
public class Main 
{
	public static void main(String[] args) 
	{
		Driver orgdrv=new Driver("Alex", 30);
		Car orgcar=new Car("Audi","Coupe",2023,orgdrv);
		Car copycar=new Car(orgcar);
		
		System.out.println(orgcar);
		System.out.println(copycar);
		
		System.out.println("==============================Changing Driver============================");
		Driver copydrv=new Driver("James", 23);
		orgcar.changeDriver(copydrv);
		
		System.out.println(orgcar);
		System.out.println(copycar);
	}
}
