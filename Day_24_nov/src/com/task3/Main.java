package com.task3;
/*Imagine you are designing a Java system to model the relationship between a Car and its underlying Engine components to illustrate the concept of 
  composition.The Car class represents an automobile, and the Engine class encapsulates the essential features of the engine powering the car.

Instructions:

Create a Car class with private attributes for the car's make, model, and year of manufacture. Implement a parameterized constructor to set these 
attributes during the car's instantiation.

Develop an Engine class with private attributes for the engine's capacity, fuel type, and horsepower. 
Implement a parameterized constructor for the Engine class.

Establish a HAS-A(composition) relationship between the Car and Engine classes by including an instance of the Engine class as a private attribute 
within the Car class. Ensure that a Car object is composed of an Engine object.

Write a method in the Car class that allows for starting the car, simulating the activation of the underlying engine. 
This method should internally invoke a method in the Engine class to initiate the engine startup.

In the main method of a separate class, create an instance of a Car with specific make, model, and year attributes, 
along with an associated Engine instance that defines the engine's characteristics. Demonstrate the composition relationship 
by invoking the car's start method and observe the coordination with the underlying engine.

Note: Follow Java naming conventions, employ proper encapsulation, and provide necessary accessor methods.
*/
public class Main 
{
	public static void main(String[] args) 
	{
		 Car myCar = new Car("Toyota", "Camry", 2022, 2.5, "Gasoline", 200);
		 myCar.start();
		 System.out.println(myCar);
	}
}
