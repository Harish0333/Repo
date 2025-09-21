package com.Ques1;
/*Create a class Address (Business Logic Class)

Instance Variables:
private String cityName;
private String districtName;
private String stateName;

Create a parameterized constructor initialize the instance variable of the class. 
Override toString() from Object class to print Address class properties.

Create a class Employee (Business Logic Class)
Instance Variables:
private int empId;
private String empName;
private Address address; //HAS-A relation

Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Employee class properties.

Create a class Main (Executable Logic Class) which contains main method to print Employee class properties using toString() method.
Output:

Employee[
Employee Number: 123
Employee Name: Naresh IT
Address[ City: Ameerpet, District: Hyderabad, State: Telangana ]

]*/
public class Main 
{
	public static void main(String[] args) 
	{
		
		Address a1=new Address("Ameerpet","Hyderabad","Telangana");
		Employee emp=new Employee(123,"Naresh",a1);
		System.out.println(emp);
	}
}
