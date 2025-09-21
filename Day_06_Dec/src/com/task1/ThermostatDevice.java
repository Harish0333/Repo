package com.task1;

public class ThermostatDevice extends SmartHomeDevice 
{
	public ThermostatDevice(String type)
	{
		super(type);
	}
	public void setTemperature(int temperature)
	{
		System.out.println("Thermostat temperature is set to " + temperature + "\u00B0C.");
	}	
}
