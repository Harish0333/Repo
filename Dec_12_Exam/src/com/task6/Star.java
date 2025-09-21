package com.task6;

public class Star 
{
	private String name;
	public Star(String name) 
	{
		super();
		this.name = name;
	}

	public void shine()
	{
		System.out.println("Earth is shining brightly.");
	}

	public void generateLight()
	{
		System.out.println("Generating light...");
	}

	@Override
	public String toString() {
		return "Planet :" + name;
	}
}
