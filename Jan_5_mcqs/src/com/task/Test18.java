package com.task;

public class Test18 
{
	int x = 10; 
	public static void main(String[] args) 
	{ 
		Test18 t1 = new Test18(); 
		System.out.println(t1.x); //10
	} 
	static
	{ 
		int x = 20; 
		System.out.print(x + " "); //20
	} 
}
