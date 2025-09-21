package com.task;

public class Clerk extends Employee
{
	//Declare Instances Variable
	//Define Getter and Setters Methods
		//create default constructor
	    //create parameterised constructor
		//override setSalary method
	int speed;
	int accuracy;
	private boolean extraAmountAdded;
	public Clerk()
	{
		extraAmountAdded = false;
	}
	public Clerk(String name, int employeeId, double salary,int speed, int accuracy) 
	{
		super();
		this.speed = speed;
		this.accuracy = accuracy;
		extraAmountAdded = false;
	}
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
		reCalculateSalary();
	}
	public int getAccuracy() 
	{
		return accuracy;
	}
	public void setAccuracy(int accuracy) 
	{
		this.accuracy = accuracy;
		reCalculateSalary();
	}
	@Override
	public void setSalary(double salary)
	{
		if(!extraAmountAdded &&speed>70 && accuracy>80) 
		{
			super.setSalary(salary+1000);
			extraAmountAdded = true;
		}
		else
		{
			super.setSalary(salary);
		}
	}
	public void reCalculateSalary()
	{
		if(!extraAmountAdded &&speed>70 && accuracy>80)
		{
			setSalary(getSalary());
			extraAmountAdded = true;
		}
		
	}
}
