package com.nit;

public class Manager 
{
	  int managerId;
	  double managerSalary;
	  
	  public void setManagerData(int id, double salary)
	  {
		  this.managerId = id;
		  this.managerSalary = salary;
	  }

		@Override
		public String toString()
		{
			return "Manager {managerId=" + managerId + ", managerSalary=" + managerSalary + "}";
		}  
	  

}
