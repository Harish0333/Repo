package com.Ques1;

public class Employee 
{
	private int empId;
	private String empName;
	private Address address;
	
	public Employee(int empId, String empName, Address empaddress) 
	{
		//super();
		this.empId = empId;
		this.empName = empName;
		this.address = empaddress;
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	} 
}
