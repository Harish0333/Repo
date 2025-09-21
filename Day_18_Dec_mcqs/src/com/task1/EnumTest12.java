package com.task1;

class NIT
{
	private static void nit()
	{
	System.out.println("nit");
	}
	static class NIT1
	{
		public static void display()
		{
		System.out.println("nit1");
		nit();
		}
	}
}
public class EnumTest12
{
	public static void main(String[] args) 
	{
	NIT.NIT1.display();
	}
}
