package com.task3;

public class FunctionalInterface 
{
	public static void main(String[] args) {
		int a = 21;
		Add add = b -> b+b;
		System.out.println(add.add(a));
	}//Error
}
