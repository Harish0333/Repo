package com.task;

public class Son extends Father
{
	protected String car;
	public Son(String land, String house, String car) 
	{
		super(land, house);
		this.car = car;
	}
	@Override
	public String toString() 
	{
		return "Son [car=" + car + ", House=" + House + ", land=" + land + "]";
	}
}
