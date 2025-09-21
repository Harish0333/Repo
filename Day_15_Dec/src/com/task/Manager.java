package com.task;

public class Manager extends Employee 
{
	private ManagerType type;
	public Manager()
	{
		//Declare Instances Variable
		// Define Getter and Setters Methods
		//create default constructor
		    //create parameterised constructor
			//override setSalary
	}
	public Manager(String name, int employeeId, double salary,ManagerType type) 
	{
		super(name,employeeId,salary);
		this.type = type;
	}
	@Override
	public void setSalary(double salary)
	{
		if (type == ManagerType.HR) 
		{
            super.setSalary(salary + 10000);
        } else if (type == ManagerType.SALES) {
            super.setSalary(salary + 5000);
        }
	}
}
