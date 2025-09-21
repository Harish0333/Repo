package com.task2;
/*
Create a Teacher class and this class should have following attributes:

private String name and 
private String subject. 

Implement a parameterized constructor to initialize all the instance variable of Teacher class.
Take a pair of setter and getter method for all the instance variables.

Create a Principal class this class should have following attributes:
private String name and 
private int yearsExperience.

Implement a parameterized constructor to initialize all the instance variable of Principal class.
Take a pair of setter and getter method for all the instance variables.*/
public class Teacher 
{
	private String name; 
	private String subject;
	
	public Teacher(String name, String subject) 
	{
		super();
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}	
}
