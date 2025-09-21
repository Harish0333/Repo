package com.task;
/*Program-1
----------
A class Employee is given to you. It contains the following:
Instance Variables: 
name:String  private  
employeeId: int  private
salary: double private
Methods: set and get methods for all.
Default constructor AND  All-fields constructor

An Enum called ManagerType is given to you. It defines the two types of managers, HR and Sales
Create two sub classes of Employee called Manager and Clerk. 
The details of each class is given below.
For class Manager:
Instance Variables:
type: enum ManagerType private

Methods: set and get methods for type. 
Default constructor AND  All-fields constructor

Override :
setSalary(): If the type is HR manager, add 10000 to the given salary. 
and for a sales manager, add 5000 to the given salary.

For class Clerk:
Instance Variables: 
speed: int
accuracy:int

Methods: set and get methods for speed and accuracy.
Default constructor AND All-fields constructor.

Override:
setSalary(): If the clerk has a typing speed of greater than 70 AND accuracy greater than 80 then add 1000 to the salary. Otherwise set the same salary. 
Note that any change in speed and accuracy(using setSpeed() or setAccuracy() ) should result in 
recalculation of salary, as the Trainee may qualify for the extra amount. 
HOWEVER, when once the extra 1000 is given for extra speed/ and accuracy it should not be given again.
For example, if a Clerk's speed is already 85 and accuracy is already 75, and the speed is changed to 90, 
then the extra amount should not be added again. This extra amount should be credited to salary only the first time the Clerk qualifies for the amount.
Provide proper constructors for all classes.
A class EmployeeTester is given to you with a main method. Use this class to test your solution's classes and methods.

-----------------------------------------------------------------------*/
public class EmployeeTester 
{
	public static void main(String[] args) 
	{
			Manager manager1 = new Manager("John", 101, 50000, ManagerType.HR);
	        System.out.println("Manager 1 Salary: " + manager1.getSalary());

	        Manager manager2 = new Manager("Alice", 102, 60000, ManagerType.SALES);
	        System.out.println("Manager 2 Salary: " + manager2.getSalary());

	        Clerk clerk1 = new Clerk("Bob", 201, 30000, 60, 85);
	        clerk1.setSalary(30000);
	        System.out.println("Clerk 1 Salary: " + clerk1.getSalary());

	        Clerk clerk2 = new Clerk("Eva", 202, 40000, 60, 85);
	        clerk2.setSalary(40000);
	        clerk2.setSpeed(80);
	        System.out.println("Clerk 2 Salary: " + clerk2.getSalary());
	}
}
