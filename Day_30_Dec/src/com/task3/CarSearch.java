package com.task3;
/*Predicate Interface:
Scenario: You are building an online marketplace for selling second-hand cars. 
You want to implement a search functionality that allows users to filter cars based on their specifications.

Write a Predicate interface implementation the car based on their price range >=10000 && <=30000 
and also based on their mileage (e.g., less than 50,000 km) then return true else return false.
If its true then print that car details otherwise print "Your car is not for sale".

Requirements : 
-----------------
Class Name : Car
atributes  : private String brand, private double price, private int mileage;
Constructor: parameterized constructor to initialize Car class fields.
methods    : setter & getter for each fields , toString()

Class Name : CarSearch
//Implement a Predicate interface to test the above conditions .
boolean test(Car car); */
interface Predicate<T>
{
	boolean test(T x);
}
public class CarSearch 
{
	public static void main(String[] args)
	{
		Car car1= new Car("Audi R8",23300,20000);
		Predicate<Car> c=(car)->
		{
			 if(car.getPrice() >= 10000 && car.getPrice() <= 30000 &&  car.getMileage() < 50000)
			 {
			   return true;
			 } 
			 else 
			 {
			   return false;
			 }		
		};
		if(c.test(car1)==true)
		{
			System.out.println("Car Details: " + car1);
		}
		else
		{
			System.out.println("Your car is not for sale.");
		}
	}
}
