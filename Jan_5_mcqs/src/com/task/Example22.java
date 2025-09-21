package com.task;

public class Example22 
{
	static int x = 10;//10

	public static void main(String[] args) 
	{
		
		System.out.println(Example22.m1()+Example22.x);//110+110=220
		System.out.println(Example22.x);
	}

	static int m1() 
	{
		Example22.x = Example22.x+100;//10+100=110
		return Example22.x;
	} 
}
