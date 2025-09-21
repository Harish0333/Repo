package com.task2;
/*Create a Car class with variables fuelType and gears, and methods start and stop.

Create a BMW class which is a subclass of Car with additional variables color and carNo. 
Override the start and stop methods with BMW-specific behavior.

Create a Audi class which is a subclass of Car with similar additional variables color and carNo. 
Override the start and stop methods for Audi-specific behavior.

Create a Driver class with overloaded ride methods that take either a BMW or an Audi as a parameter.

In Main class Create instances of BMW and Audi, and use the Driver class to test driving scenarios. 
Display the messages indicating the start and stop actions for each car.*/
public class Main 
{
	public static void main(String[] args) 
	{
		Driver d1=new Driver();
		BMW b1=new BMW("Premium petrol","Automatic gearshift","Matte Black", 2330);
		System.out.println(b1);
		d1.ride(b1);
		
		System.out.println();
		Audi a1=new Audi("Extra Premium","Normal shift","Fog white", 2790);
		System.out.println(a1);
		d1.ride(a1);
	}
}
