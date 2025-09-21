package com.task2;
/*Class Employee
Fields: id: int, name : String, basicSalary : double, HRAPer : double, DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer
*/
public class Employee 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
	}

	public double calculateGrossSalary()
	{
		return basicSalary +HRAPer +DAPer;
	}
}
