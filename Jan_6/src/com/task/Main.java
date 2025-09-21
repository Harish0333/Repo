package com.task;

public class Main 
{
	public static void main(String[] args) 
	{
		Address a=new Address("Gudiwada", "Krishna", "Andhra pradesh");
		Employee e=new Employee(1234,"Harish",a);
		
		System.out.println(a.toString());
		System.out.println(e.toString());
	}
}
