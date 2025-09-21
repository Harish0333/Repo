package com.task;
import java.lang.FunctionalInterface;
/*
//@FuctionalInterface
interface S
{
	void method();
}
public class Java8 
{
	public static void main(String[] args) 
	{
		S str=() -> System.out.println("NareshIT");
		str.method();
	}
}*/


interface NITi
{
	public int myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NITi nit = (a) -> a+1;
		
	}
}
