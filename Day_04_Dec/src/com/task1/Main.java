package com.task1;
/*Create a Java (BLC)class named Employee with following attributes:
private String name 
private int age 
private double salary and 
private String department

Implement a parameterised constructor to initialize all the instance variable of Employee.
Implement a copy constructor for the Employee class that takes a Employee object and initialize 
the new Employee object with the same attributes.

Take a pair of setter and getter method for all the instance variables.
In the Employee class, create a method named raiseSalary(double percentage) that increases the salary of the employee 
by the specified percentage.

Create a ELC class and create Employee object and sets its attributes. 
Then, use the raiseSalary method to increase the employee's salary by 10%. Create a copy of the Employee object using 
the copy constructor and print the attributes of both the original and the copy of the Employee objects to confirm that 
the copy constructor works correctly and that the raiseSalary method did not affect the attributes of the copy of the 
Employee object.*/
public class Main 
{
	public static void main(String[] args) 
	{
	Employee orge1=new Employee("Hari",25,25000,"Designing");
	orge1.raiseSalary(10);
	
	Employee copye1=new Employee(orge1);
	
	System.out.println(orge1);
	System.out.println(copye1);
	}
}
