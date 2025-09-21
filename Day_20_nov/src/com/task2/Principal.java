package com.task2;
/*Create a Principal class this class should have following attributes:
private String name and 
private int yearsExperience.

Implement a parameterized constructor to initialize all the instance variable of Principal class.
Take a pair of setter and getter method for all the instance variables.*/
public class Principal 
{
	private String name;
	private int yearsExperience;
	
	public Principal(String name, int yearsExperience) 
	{
		super();
		this.name = name;
		this.yearsExperience = yearsExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	@Override
	public String toString() {
		return "Principal [name=" + name + ", yearsExperience=" + yearsExperience + "]";
	}

}
