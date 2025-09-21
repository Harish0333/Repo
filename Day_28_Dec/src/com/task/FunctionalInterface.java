package com.task;

public class FunctionalInterface
{
	public static void main(String[] args)
	{
		int a = 10;
		
		Add add = (int b) -> b;
		System.out.println(add.add(a));
	}
}
//Ans 10