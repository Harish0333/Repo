package com.task2;

public class Activity 
{
	public String name ; 
	public String schedule ;
	
	public Activity(String name, String schedule) 
	{
		super();
		this.name = name;
		this.schedule = schedule;
	}

	protected String getName() 
	{
		return name;
	}

	protected String getSchedule() 
	{
		return schedule;
	}

	@Override
	public String toString() 
	{
		return name +schedule+"\n";
	}	
	
}
