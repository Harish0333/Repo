package com.task21;
public class Employee 
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String Fname,String Lname,int eid,double sal,int projects) 
	{
		firstName=Fname;
		lastName=Lname;
		employeeId=eid;
		salary=sal;
		noOfProject=projects;
	}
	public void calculateSalary() 
	{
		
		if(noOfProject>20)
		{
			salary+=15000;
		}
		else if(salary>10)
		{
			salary+=10000;
		}
		else if(salary>5)
		{
			salary+=5000;
		}
		else
		{
			salary=salary+0;
		}
	}
	
	@Override
	public String toString() 
	{
		return "Employee firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + ".";
	}
}
