package com.task;

public class Example24 
{
	static 
	{
		Example24.a = m1();//50--------
	}

	static int a = 50;

	public static void main(String[] args) 
	{
		System.out.println(a);//100
	}

	static 
	{
		Example24.a = Example24.a+m1();//50+50=100
	}

	static int m1() 
	{
		Example24.a = 30;
		return m2();
	}

	static int m2() 
	{
		System.out.println(a);//30-------------1
		return Example24.a+20;//30+20=50
	}
}
