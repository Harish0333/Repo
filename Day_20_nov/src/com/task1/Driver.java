package com.task1;
/*Create a Driver class and the class should have following attributes:
private String name and
private int age 
Implement a parameterized constructor to initialize all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.*/
public class Driver 
{
	//Declare instance variables
	private String name;
	private int age;
	 //create a constructor to initialize instance variables
	public Driver(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 //generate setters and getter for instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//override to string method
	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "]";
	}
	
}
