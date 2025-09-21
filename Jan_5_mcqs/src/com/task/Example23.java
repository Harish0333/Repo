package com.task;

public class Example23 
{
	static int x = m1();//100

	public static void main(String[] args) 
	{
		System.out.println("Main :"+Example23.x);
	}

	static 
	{
		System.out.println("Static block: "+x);
		Example23.x = x+20;//100+20=120
	}

	static int m1() 
	{
		Example23.x = 50;//50
		return m2();		
	} 

	static int m2() 
	{
		System.out.println("M2"+Example23.x);//50
		return 100;
	}
}
