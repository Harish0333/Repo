package com.task7;

public class Java8 
{
	public static void main(String[] args) 
	{
		NIT nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}
