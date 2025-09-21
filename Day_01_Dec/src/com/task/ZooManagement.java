package com.task;
/*Zoo Management System
You are tasked with creating a Zoo Management System that can handle different types of animals. 
You need to implement classes that represent animals and their specific characteristics. 
In this system, you'll implement the concept of inheritance and method overriding to showcase the behavior of animals.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

  Create a class named Animal:
    It should have private instance variables name (String) and age (int).
    Implement a constructor that initializes the name and age.
    Define a method makeSound() that prints "The animal makes a generic sound."
    Define a method displayInfo() that prints the name and age.
    
  Create a subclass named Lion:
    Extend the Animal class.
    Add a private instance variable maneLength (int).
    Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
    Define a method makeSound() method to print "The lion roars loudly."
    Define a method displayManeLength() that prints the maneLength.

  Create another subclass named Elephant:
    Extend the Animal class.
    Add a private instance variable tuskLength (float).
    Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
    Define a method the makeSound() method to print "The elephant trumpets."
    Define a method displayTuskLength() that prints the tuskLength.

  Create a class named ZooManagement (as provided in the code):
    In the main method, create instances of both Lion and Elephant with appropriate values.
    Print information about the lion and the elephant, including their specific attributes and the sounds they make.

Your task is to implement the required classes based on the provided problem description.  */
class Animal 
{
	private String name;
	private int age;
	
	public Animal(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() 
	{
		System.out.println("The animal makes a generic sound.");
	}
	
	public void displayInfo()
	{
		System.out.println("Name is "+name+" and age : " +age);
	}

	@Override
	public String toString() {
		return "Animal name = " + name + ", age=" + age+",";
	}
	
}

class Lion extends Animal 
{
	private int maneLength;

	public Lion(String name, int age, int maneLength) 
	{
		super(name, age);
		this.maneLength = maneLength;
	}
	public void makeSound() 
	{
		System.out.println("The lion roars loudly.");
	}
	
	public void displayInfo()
	{
		System.out.println(super.toString()+" "+"ManeLength " +maneLength);
	}
	
}

class Elephant extends Animal 
{
	private int tuskLength;

	public Elephant(String name, int age, int tuskLength) 
	{
		super(name, age);
		this.tuskLength = tuskLength;
	}
	
	public void makeSound() 
	{
		System.out.println("The elephant trumpets.");
	}
	
	public void displayInfo()
	{
		System.out.println("TuskLength " + tuskLength);
	} 
	
}

public class ZooManagement 
{
	public static void main(String[] args) 
	{
		Animal aml=new Animal("Monkey", 5);
		Lion Leo=new Lion("Simba", 10, 6);
	
		aml.displayInfo();
		aml.makeSound();
		
		Leo.displayInfo();
		Leo.makeSound();		
	}
}
