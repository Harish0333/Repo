package com.task2;
/*Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee) - returns a double
calculateTax(Manager) - returns a double
calculateTax(Trainer) - returns a double
calculateTax(Sourcing) - returns a double

Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is 5%
*/
public class TaxUtil 
{
	public double calculateTax(Employee employee)
	{
		if(employee.calculateGrossSalary()>30000)
		{
			return employee.calculateGrossSalary()*0.20;
		}
		else
		{
			return employee.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax(Manager manager)
	{
		if(manager.calculateGrossSalary()>30000)
		{
			return manager.calculateGrossSalary()*0.20;
		}
		else
		{
			return manager.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax (Trainer trainer)
	{
		if(trainer.calculateGrossSalary()>30000)
		{
			return trainer.calculateGrossSalary()*0.20;
		}
		else
		{
			return trainer.calculateGrossSalary()*0.05;
		}
	}
	public double calculateTax(Sourcing sourcing)
	{
		if(sourcing.calculateGrossSalary()>30000)
		{
			return sourcing.calculateGrossSalary()*0.20;
		}
		else
		{
			return sourcing.calculateGrossSalary()*0.05;
		}
	}
}
