package com.Task1;
/*Create a class Employee (Business Logic Class)

Instance Variables: 
employeeId :private-int
employeeName : private-String
employeeSalary: private-double

Create a parameterized constructor to initialize all the fields.

Create a static method getEmployeeObject() in the Employee class
  	Method Name : getEmployeeObject()
   	Parameter : no parameter
  	Return type : Employee
	Access modifier : public

getEmployeeObject() method of Employee class should take employeeId, employeeName, employeeSalary from the keyboard 
to initialize the instance variables, Create and return the Employee object from this method.
Override toString() from Object class to print Employee class properties.

Create another class Main which contains main method (ELC class). 
Accept 5 Employee Object from keyboard and print their data using toString() method 
*/
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee[] employees = new Employee[5];
		 for (int i=0;i<5;i++) 
		 {
	       System.out.println(Employee.getEmployeeObject());
	     }
		 System.out.println("\nEmployee Details:");
		 for (Employee employee : employees) 
		 {
	            System.out.println(employee);
	        }
	}
}
