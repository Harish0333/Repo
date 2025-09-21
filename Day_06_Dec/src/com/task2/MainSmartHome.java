package com.task2;
/*1.Create a class SmartHomeDevice

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

2. Create another VoiceAssistantIntegration class inheriting from SmartHomeDevice  

Create a parameterized constructor.

//Use super keyword to initialize SmartHomeDevice class constructor attributes.

Create an instance method executeVoiceCommand() with parameter command type String.

//if command contains "turn on" then call turnOn() method
//if command contains "turn off" then call turnOff() method
//if command contains "dim" then print "Adjusting brightness..."
//if command contains "set temperature" then print "Setting temperature..."
//Otherwise print "Command not recognized."

3.Create a class MainSmartHome which contains main method to demonstrate the usage.

//Creating a VoiceAssistantIntegration object to call the methods.
// Simulating voice commands

Output:-

Voice Assistant is turned on.
Setting temperature...
Adjusting brightness...
Voice Assistant is turned off.*/
public class MainSmartHome 
{
	public static void main(String[] args) 
	{
		VoiceAssistantIntegration i=new VoiceAssistantIntegration("Voice Assistant");
		i.VoiceCommand("turn on");
		i.VoiceCommand("set temperature");
		i.VoiceCommand("dim");
		i.VoiceCommand("turn off");
	}
}
