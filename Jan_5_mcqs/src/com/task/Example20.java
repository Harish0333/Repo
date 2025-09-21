package com.task;

public class Example20 
{
	static int a;//0
	
	public static void main(String[] args) 
	{
		System.out.println(Example20.a);//0
		Example20.a = Example20.initialize();//0=60
		System.out.println(Example20.a);//60
	}

	static int initialize() 
	{
		Example20.a = 50;
		return 60;
	}
}
