package com.task;

public class Test15Sub extends Test15 
{
	static int x =20;
	static 
	{
		System.out.println("Test15Sub : SB1 called");
	}
	static void m2()
	{
		m1();
		System.out.println("Test15Sub : m2()");
	}
	public static void main(String[] args) 
	{
		m2();
	}
}
