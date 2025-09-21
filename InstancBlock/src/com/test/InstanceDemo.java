package com.test;

public class InstanceDemo 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		System.out.println(t1);
	}
}
class Test 
{
	{
		System.out.println("Instance Block");
	}
	public Test()
	{
		super();
		System.out.println("No Argument constructor !!!");
	}
	@Override
	public String toString() {
		return "Test []";
	}

}

