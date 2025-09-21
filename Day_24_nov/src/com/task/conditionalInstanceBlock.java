/*Write a program with an instance block that initializes an instance variable based on a condition.
Use a conditional statement (if-else) inside the instance block.
Create a class called ConditionalInstanceBlock.

declare 2 instance variables 

private static int a;

private static int b;

private String s;

create a default constructor and print instance variable s.
create a static block and initialize a and b variables with 20 and 16.
create an instance block and implement below logic.
if a is big initialize instance variable s with "big value is ="+a
else if b is big then s value should be "big value is ="+b
else s value should be "both are equal".
in main method create and object to ConditionalInstanceBlock class and run the program.*/
package com.task;

public class conditionalInstanceBlock 
{
	private static int a;
	private static int b;
	private String s;
	
	public conditionalInstanceBlock()
	{
		System.out.println(s);
	}
	
	static
	{
		a=20;
		b=16;
	}
	
	{
		if (a > b) 
		{
            s = "big value is =" + a;
        } 
		else if (b > a) 
		{
            s = "big value is =" + b;
        }
		else 
        {
            s = "both are equal";
        }
	}
	public static void main(String[] args) 
	{
		conditionalInstanceBlock c=new conditionalInstanceBlock ();
		
	}
}
