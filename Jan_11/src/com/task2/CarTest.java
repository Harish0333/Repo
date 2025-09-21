package com.task2;
/*We have Four classes named as CarStopped, CarPuncture, CarHeat and CarTest

For CarStooped: extends Exception
This class is used for raise the exception if any reason except puncture and heat the car 
Instance Methods:
No Instance methods
Methods:
Parameterized Construstor with String as parameter

For CarPuncture: extends Exception
This class is used for raise the exception if car is punctured
Instance Methods:
No Instance methods
Methods:
Parameterized Construstor with String as parameter
Parameterized Construstor with String as parameter

For CarHeat: extends Exception
This class is used for raise the exception if the car engine is more than 50 degrees celcious
Instance Methods:
No Instance methods
Methods:
Parameterized Construstor with String as parameter.

For  CarTest class
Instance Variables:
No Instance Variables
Methods:
Stop(String): void: static
This class throws CarStopped. If the string is “stop” throw new exception and get the message or else message is Car not stall

For  CarPuncture class
Instance Variables:
No Instance Variables
Methods:
puncture(String): void: static
This class throws CarPuncture. If the string is “puncture” throw new exception and get the message line “Car is Punchred” or else message is Car not stall.

For  CarPuncture class
Instance Variables:
No Instance Variables
Methods:
carHeat(int): void: static
This class throws CarHeat. If the car heat is more than 50 degrees calicoes it throw new exception and get the message line “Car is heated more the 50 degrees” or else message is Car not stall.
This class is given to you with a main method
Use this class to test your solution's classes and methods*/
public class CarTest 
{
	public static void Stop(String msg)throws CarStopped
	{
		if(msg=="stop")
		{
			throw new CarStopped("Car stops");			
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	public static void puncture(String x)throws CarPuncture
	{
		if(x=="puncture")
		{
			throw new CarPuncture("Car is Punchtured");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	public static void carHeat(int x)throws CarHeat
	{
		if(x>50)
		{
			throw new CarHeat("Car is heated more the 50 degrees");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			Stop("stop");
		}
		catch(CarStopped e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			puncture("puncture");
		}
		catch(CarPuncture e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			carHeat(60);
		}
		catch(CarHeat e)
		{
			System.out.println(e.getMessage());
		}
	}
}
