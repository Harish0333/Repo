package com.task2;
/*Class Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance
*/
public class Manager 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}

	public double calculateGrossSalary()
	{
		return basicSalary +HRAPer +DAPer + projectAllowance;
	}
}
