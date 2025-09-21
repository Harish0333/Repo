package com.task;
/*Design a SmartHomeDevice class with attributes like type, status, and control methods.in java using un-checked Exception.

---------------------------------------------------

Explanation:-

The SmartHomeDevice class has attributes type (representing the device type, e.g., "Light", "Thermostat") and status (a boolean indicating whether the device is on or off).

Constructors and getters/setters are provided for accessing and modifying these attributes.

Methods turnOn() and turnOff() are used to control the device's status. They throw custom runtime exceptions if the device is already in the requested state (e.g., trying to turn on a device that's already on).

Custom runtime exceptions (DeviceAlreadyOnException and DeviceAlreadyOffException) are defined to handle scenarios where the device is already in the requested state.

This structure allows for the creation of SmartHomeDevice objects and facilitates controlling their status while handling runtime exceptions for invalid operations on the device's status.



Generate an ELC class MainDevice which contain main method to test your code.



Output:-

Device Type: Smart Light

Initial Status: false

Smart Light is now ON.

Error: Device is already turned on.

Smart Light is now OFF.

Error: Device is already turned off.*/
public class MainDevice {

	public static void main(String[] args) throws RuntimeException
	{
		SmartHomeDevice s= new SmartHomeDevice("Light", false);
		System.out.println("Device type :"+s.getType());
		System.out.println("Initial Status :"+s.isStatus());
		
		s.turnOn();
		try
		{
			s.turnOn();
		}
		catch(DeviceAlreadyOnException e)
		{
			System.out.println("Error :"+e.getMessage());//already turned on
		}
		
		s.turnOff();
		try
		{
			s.turnOff();
		}
		catch(DeviceAlreadyOffException e)
		{
			System.out.println("Error :"+e.getMessage());
		}
	}

}
