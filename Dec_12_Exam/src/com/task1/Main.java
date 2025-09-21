package com.task1;
/*Questions 1
-------------
Vehicle Class:

Properties:

String brand: private

String model: private

Take one Constructor to initialize the brand and model properties.

startEngine(): Method to display .

stopEngine(): Method to display car is stopped.

displayInfo(): Method to display information about the vehicle.

2. Car Class (Subclass of Vehicle):

Additional Properties:

String fuelType: private


Develop a Constructor to initialize the brand, model, and fuelType properties.

3. SportsCar Class (Subclass of Car):

Additional Properties:

int topSpeed:private

Develop a Constructor to initialize all properties, including the topSpeed.

performSpecialAction(): Method to demonstrate a special action specific to a sports car.

Create a main class and create all classes object. 

Call each method and display the output.*/
public class Main 
{
	public static void main(String[] args) 
	{
		Vehicle v1=new Vehicle("Audi", "R8");
		System.out.println(v1);
		v1.startEngine();
		v1.stopEngine();
		
		System.out.println("***********************");
		Car c1=new Car("Porsche", "Panarama", "Premuim Petrol");
		System.out.println(c1);
		c1.startEngine();
		c1.stopEngine();
		System.out.println("***********************");
		
		SportsCar s1=new SportsCar("Range Rover", "Discovery", "Extre Premuim Petrol",250);
		System.out.println(s1);
		s1.startEngine();
		s1.stopEngine();
		s1.performSpecialAction();
	}
}
