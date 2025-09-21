package com.task;

public class Example17 
{
	int x = 10; 
	public static void main(String[] args) 
	{ 
		System.out.println(x); ///cannot make a static reference to the non ststic field
	} 
	static
	{ 
		System.out.print(x + " "); 
	} 
}
