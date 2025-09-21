package com.task6;

public class Planet extends Star
{
	private double  diameter;
	private String atmosphere;
	private int numberOfMoons;

	public Planet(String name, double diameter, String atmosphere, int numberOfMoons) 
	{
		super(name);
		this.diameter = diameter;
		this.atmosphere = atmosphere;
		this.numberOfMoons = numberOfMoons;
	}

	public void rotate()
	{
		System.out.println("Earth is rotating.");
	}

	public void rotate(int speed)
	{
		System.out.println("Earth is rotating at a speed of 5 units.");
	}

	public void rotate(String direction)
	{
	System.out.println("Earth is rotating in the counterclockwise direction.");	
	}

	@Override
	public String toString() {
		return super.toString()+"\nPlanet diameter=" + diameter + " km, \nAtmosphere=" + atmosphere + ", \nNumber Of Moons = " + numberOfMoons;
	}	
}
