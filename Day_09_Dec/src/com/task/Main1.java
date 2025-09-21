package com.task;
class Test
{
	public void access(byte b)
	{
	System.out.println("byte is executed :"+b);
	}
	public void access(short b)
	{
	System.out.println("short is executed :"+b);
	}
}
public class Main1 
{
	public static void main(String[] args)
	{
	   Test t1 = new Test();
	   t1.access(15);
	}
}