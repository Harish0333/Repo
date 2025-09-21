package com.Single_level;
class A
{
	A(String str)
	{
		super();
		System.out.println("My Institute Name is :"+str);
	}
}
class B extends A
{
	 B()
	{
		super("Nit");
		System.out.println("No Argument Constructor of B class");
	}
}

public class ConstructorTest 
{
	public static void main(String[] args) 
	{
		new B();
	}
}
