package com.task2;
/*Create a class called Watch.
	instance variables are 
	String typeOfWatch
	String brand
	double price
	
1)create parameterized constructor to initialise instance variables 	
	create instance method showTime(). retrurns void. 
		empty body
	
	override toString() method to display instance variables.

2)create a class called AnalogWatch. which is a sub class of Watch.
	create a parameterized constructor to initialise super class's instance variables. ("Analog", "Ajanta", 1000)
	override toString() method and call super class's toString() method.

		override showTime()  
		this method should display time in HH:MM format. Example: 10:20
		

3)create a class called DigitalWatch. which is sub class of Watch.
	create a parameterized constructor to initialise super class's instance variables ("Digital", "Casio", 2200)
	override toString() method and call super class's toString() method.
	override showTime() .
		this method should display date and time in DD-MM-YYYY HH:MM format. Example: 13-12-2023 14:20
		

4)create a class called SmartWatch. which is sub class of Watch
	create a parameterized constructor to initialise super class's instance variables ("Smart", "Apple", 22000)
	override toString() method and call super class's toString() method.
	override showTime()
	this method should display date and time along with timeZone in  DD-MM-YYYY HH:MM timeZone format. Example:13-12-2023 10:20 IST
		
5)Create a MainWatch calss and test your code.

create AnalogWatch, DigitalWatch and SmartWatch objects and call showTime method and print details.
*/
public class MainWatch 
{
	public static void main(String[] args)
	{
		AnalogWatch a1=new AnalogWatch("Analog", "Ajanta", 1000);
		System.out.println(a1);
		a1.showTime();
		System.out.println("---------------------------------------");
		DigitalWatch d1=new DigitalWatch("Digital", "Casio", 2200);
		System.out.println(d1);
		d1.showTime();
		System.out.println("---------------------------------------");
		SmartWatch s1=new SmartWatch("Smart", "Apple", 22000);
		System.out.println(s1);
		s1.showTime();
	}

}
