package com.task4;

public class Penguin extends Animal 
{
	@Override
	public void HealthCheck()
	{
		System.out.println("Health checkup for Penguin");
		super.HealthCheck();
	}
}
