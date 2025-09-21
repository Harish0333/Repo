package com.Task1;
import java.util.Scanner;
public class Employee 
{
	private int EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.EmployeeSalary = employeeSalary;
	}
	public static Employee getEmployeeObject() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter employee Id:,employee Name:,employee Salary:");
		Employee employee=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		//sc.close();
		return employee;
	}
	@Override
	public String toString() 
	{
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}
}
