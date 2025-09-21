package com.getter;
/*Create a class Employee (Business Logic Class)
 Instance Variables:
 employeeNumber : private-int
 employeeName : private-String
 employeeSalary:private -double
 Create a parameterized constructor to initialilize all the fields.
 Create getters method for all the instance variables.
 Create another class Main which contains main method (ELC class) which will receive all the instance variable value from BLC class.
 In this ELC class print the following details
 a) If salary is >=60000, Print Employee is a Developer
 b) If salary is >=40000 and <60000 , Print Employee is a Designer
 c) If Salary is <40000 , Print Employee is a Tester
Input:
232, "Naresh Kumar", 43000
Output:
Employee is a Designer
*/
public class AccessInstanaceVariablesUsingGetter 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(232,"Naresh Kumar",43000);
		int employeeNumber = emp.getEmployeeNumber();
        String employeeName = emp.getEmployeeName();
        double employeeSalary = emp.getEmployeeSalary();

        // Printing employee details
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
		
		if (employeeSalary>=60000)
		{
			System.out.println("Employee is a Developer");
		}
		else if(employeeSalary>=40000) 
		{
			System.out.println("Employee is a Designer");	
		}
		else
		{
			System.out.println("Employee is a Tester");
		}
	}
}
