package com.task;
/*Program 01 :
------------
We have Two class named as Test and Handling
For Handling class
Instance Variables:
No Instance Variables
Methods:
nit(int) : void : static
nit1(int) : void: static

For method nit(int):
In try block print ‘Naresh’ and call nit1(int) method pass same parameter as nit(int) method then after print ‘I’.

In catch block need to pass Exception as a parameter print the message.

For method nit1(int):
nit1() method must throws the Exception

In try block need to check arithmetic operation (division), any value divided by parameter value then print ‘Completed’ 

For example pass the value is zero from parameter it throws ArithmeticException so we need to catch or throw the customize exception
For example parameter value is 10 it throw the Exception
Catch Block
We need to catch ArithmeticException to print message
Finally block
In this print ‘Finally’ message

For Test class
This class is given to you with a main method
Use this class to test your solution's classes and methods
Need to check the test cases like 0, 1, 10, 15 as input and write the output
*/
public class Test 
{
	public static void main(String[] args) 
	{
		Handling.nit(0);
		Handling.nit(1);
		Handling.nit(10);
		Handling.nit(15);
	}
}
