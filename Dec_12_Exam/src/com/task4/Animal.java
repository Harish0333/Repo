package com.task4;

public class Animal 
{
	private int HealthCheckups;
	public Animal()
	{
		this.HealthCheckups = 0;
	}
	
	public void HealthCheck()
	{
		System.out.println("General health checkup for animal");
		HealthCheckups++;
	}
	
	public int getHealthCheckups()
	{
		return HealthCheckups;
	}
}
