package com.task4;

public class Elephant extends Animal 
{
	@Override
	public void HealthCheck()
	{
		System.out.println("Health checkup for Elepant");
		super.HealthCheck();
	}
}
