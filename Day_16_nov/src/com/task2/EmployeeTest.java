package com.task2;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		Employee employee = new Employee("Harish",23,50000.0,"IT");
        System.out.println("Original Employee Details:");
        System.out.println(employee);

        employee.raiseSalary(10);
        System.out.println("Employee Details after Salary Raise:");
        System.out.println(employee);

        Employee copyemployee = new Employee(employee);
        System.out.println("Original Employee Details:");
        System.out.println(employee);
        
        System.out.println("Copy Employee Details:");
        System.out.println(copyemployee);
	}

}
