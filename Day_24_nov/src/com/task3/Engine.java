package com.task3;

public class Engine 
{
	private double  enginecapacity;
	private String fueltype;
	private int horsepower;
	
	public Engine(double enginecapacity, String fueltype, int horsepower) 
	{
		super();
		this.enginecapacity = enginecapacity;
		this.fueltype = fueltype;
		this.horsepower = horsepower;
	}
	
	public void start() 
	{
        System.out.println("Engine starting...");
    }

	@Override
	public String toString() {
		return "Engine [enginecapacity=" + enginecapacity + ", fueltype=" + fueltype + ", horsepower=" + horsepower
				+ "]";
	}
	
}
