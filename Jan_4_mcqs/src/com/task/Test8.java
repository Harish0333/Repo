package com.task;

public class Test8 
{
	static void m1() 
	{
		System.out.println("Test8 : m1() called");
	}

	public static void main(String[] args) 
	{
		Test8.m1();
		m1();
		Test8 t=new Test8();
		t.m1();
	}
}
