package com.Program1;
/*Program 01:
  -----------
    Create a class Person with instance variables name and age. Implement an instance block that prints "Person instance created". 
    Implement a constructor that sets the instance variables name and age. Implement an instance method introduce() 
    that prints "Hi, my name is {name} and I'm {age} years old". Create two Person objects and call the introduce() method on them.
  -----------------------------------------------------------------------*/
public class Person 
{
	String name;
	int age;
	{
		System.out.println("Person instance created");
	}
	public Person(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	public void introduce() 
	{
		System.out.println("Hii My name is "+name+" and");
		System.out.println("I'm "+age+" years old");
	}
	public static void main(String[] args) 
	{
		Person p1=new Person("Harish",27);
		Person p2=new Person("Prudhvi",25);
		p1.introduce();
		p2.introduce();	
	}
}
