package com.task;

public class Test19 
{
	static 
	{
		Example24.a = m1();//50 prints 30
	}

	static int a = 50;

	public static void main(String[] args) 
	{
		System.out.println(a);//
	}

	static 
	{
		Example24.a = Example24.a+m1();// prints 30 
	}

	static int m1() 
	{
		Example24.a = 30;//30
		return m2();//50
	}

	static int m2() 
	{
		System.out.println(a);//30------------1
		return Example24.a+20;//30+20=50
	}
}
