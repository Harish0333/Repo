package com.test;
class Foo
{
	int x;
	
	public Foo()
	{
		System.out.println(x);
	}
	
	{
		x = 100;
		System.out.println(x);
	}
	

	{
		x = 200;
		System.out.println(x);
	}
	

	{
		x = 300;
		System.out.println(x);
	}
	
}


public class InstanceDemo2 
{

	public static void main(String[] args) 
	{
		new Foo();

	}
}
