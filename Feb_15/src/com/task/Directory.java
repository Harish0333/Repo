package com.task;

import java.util.ArrayList;

public class Directory 
{
	private ArrayList<Employee> employees;
	
	public Directory() 
	{
	   this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee emp)
	{
		employees.add(emp);
	}
	public void displayAllEmployees()
	{
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
	}
	public void updateEmployee(int index, String position, double salary)
	{
		 Employee emp = employees.get(index);
	     emp.setPosition(position);
	     emp.setSalary(salary);
	}
	public void deleteEmployee(int index)
	{
		employees.remove(index);
	}
}
