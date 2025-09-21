package com.task2;
/*The payroll system of an organization involves calculating the gross salary of each type of employee and the tax applicable to each. 
Create the following entity classes as described below.

Class Employee
Fields: id: int, name : String, basicSalary : double, HRAPer : double, DAPer : double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer

Class Manager
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, projectAllowance: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance

Class Trainer
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
Public Method: calculateGrossSalary() - returns a double
Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)

Class Sourcing
Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, 
enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)

Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee) - returns a double
calculateTax(Manager) - returns a double
calculateTax(Trainer) - returns a double
calculateTax(Sourcing) - returns a double

Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%

Note : Attributes/Fields must be non-Private for the above classes.
A ClassObject class is given to you with the main Method. Use this class to test your solution.*/
public class ClassObject 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(1,"Ramu",40000, 3200, 2500);
		 
		Manager m1 = new Manager(2,"Chandu", 75000, 3500, 4000, 10000);
		  
		Trainer t1 = new Trainer(3,"Ballu", 60000, 3500, 2800, 10, 250);
		  
		Sourcing source = new Sourcing(4,"Prudhvi", 80000, 3300, 2800, 100, 20, 70);
		 
		TaxUtil t = new TaxUtil();
		
		System.out.println("Employee Tax is :"+t.calculateTax(emp));
		System.out.println("Manager Tax is :"+t.calculateTax(m1));
		System.out.println("Trainer Tax is :"+t.calculateTax(t1));
		System.out.println("Sourcing Tax is :"+t.calculateTax(source));
	}
}
