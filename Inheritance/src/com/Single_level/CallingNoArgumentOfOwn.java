package com.Single_level;

class Parentt
{
	public Parentt()
	{
		super();
		System.out.println("No Argument of Parent class");
	}
	
	public Parentt(int x)
	{
		this();
		System.out.println("Parameterized constructor of Parent class :"+x);
	}
}
class Child2 extends Parentt
{
	public Child2()
	{
		super(15);
		System.out.println("No Argumenet of Child class");
	}
}

public class CallingNoArgumentOfOwn 
{

	public static void main(String[] args) 
	{
		new Child2();
	}

}
