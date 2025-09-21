package com.task1;
/*Design a SmartHomeDevice class with attributes like type, status, and control methods.
1.Create a class SmartHomeDevice

Instance variable:-
String type,private
boolean status,private
Create a parameterized constructor for type variable to initialize the variable
// Device is initially turned off
Generate Getters and setters for all Instance variable to get values and set values.
Create an instance method turnOn() to turn on the device
//print "is turned on."
Create an instance method turnOff() to turn off the device
//print "is turned off."
2. Create a Subclass LightDevice inheriting from SmartHomeDevice
Create a parameterized constructor.
//Use super keyword to initialize SmartHomeDevice class constructor attributes.
Create an instance method dim() with parameter brightness type interger.
//print "Light brightness is set to " + brightness + "%."
3.Create another Subclass ThermostatDevice inheriting from SmartHomeDevice
Create a parameterized constructor.
//Use super keyword to initialize SmartHomeDevice class constructor attributes.
Create an instance method setTemperature() with parameter temperature type integer.

//print "Thermostat temperature is set to " + temperature + " C."
4.Create a class MainSmart which contains main method to demonstrate the usage.

//Creating a LightDevice object to call the methods.
//Creating a ThermostatDevice object to call the methods.

Output:-

Light is turned on.
Light brightness is set to 50%.
Thermostat is turned on.
Thermostat temperature is set to 22 C.
Light is turned off.
Thermostat is turned off.*/
public class MainSmart 
{
	public static void main(String[] args) 
	{
		LightDevice LD=new LightDevice("Light");
		LD.turnOn();
		LD.dim(50);
		LD.turnOff();
		
		ThermostatDevice TD=new ThermostatDevice("Thermostat");
		TD.turnOn();
		TD.setTemperature(22);
		TD.turnOff();
	}
}
