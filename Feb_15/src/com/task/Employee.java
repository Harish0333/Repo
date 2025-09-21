package com.task;

public class Employee 
{
	public String name;
	public String position;
	public double salary;
	
	protected String getName() 
	{
		return name;
	}

	protected void setName(String name) 
	{
		this.name = name;
	}

	protected String getPosition() 
	{
		return position;
	}

	protected void setPosition(String position) 
	{
		this.position = position;
	}

	protected double getSalary() 
	{
		return salary;
	}

	protected void setSalary(double salary) 
	{
		this.salary = salary;
	}

	public Employee(String name, String position, double salary) 
	{
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}
