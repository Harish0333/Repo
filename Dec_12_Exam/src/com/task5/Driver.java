package com.task5;
/*Questions 5
------------
Create a super class Vehicle with private attributes brand and model. Implement two methods start() and stop(). Also, provide a toString() method to display the details of the vehicle.

Implement a subclass TwoWheeler that extends the Vehicle class. Add a private attribute yearOfManufacture and a method honk(). Override the toString() method to include the year of manufacture.

Further, create a subclass TVS that extends the TwoWheeler class. Implement a parameterized constructor that initializes the brand, model, and year of manufacture for a TVS two-wheeler. Override the start(), stop(), and honk() methods to display specific messages for TVS vehicles.

Implement another subclass FourWheeler that extends the Vehicle class. Similar to TwoWheeler, add a private attribute yearOfManufacture and a method honk(). Override the toString() method to include the year of manufacture.

Finally, create a subclass Audi that extends the FourWheeler class. Implement a parameterized constructor for Audi vehicles, and override the start(), stop(), and honk() methods to display specific messages for Audi cars.

Your task is to:

Implement the main class Driver.

Create instances of TVS and Audi in the Driver class.

Invoke the methods start(), stop(), and honk() on both instances.

Display the details of each vehicle using the toString() method.
*/
public class Driver {

	public static void main(String[] args) 
	{
	
	TVS t1=new TVS("Apache", "rtr-160", 2020);
	System.out.println(t1);
	t1.start();
	t1.stop();
	t1.honk();
	
	Audi a1=new Audi("Audi","R8",2023);
	System.out.println(a1);
	a1.start();
	a1.stop();
	a1.honk();
	}

}
