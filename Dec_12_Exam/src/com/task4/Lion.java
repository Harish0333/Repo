package com.task4;

public class Lion extends Animal 
{
	@Override
	public void HealthCheck()
	{
		System.out.println("Health checkup for Lion");
		super.HealthCheck();
	}
}
