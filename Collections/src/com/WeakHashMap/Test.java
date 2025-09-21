package com.WeakHashMap;

public class Test 
{
	@Override
	public String toString()
	{
		return "Test Nit";
	}
	
	@Override
	public void finalize() //called automaticaly if an object is eligible 4 GC
	{
		System.out.println("finalize method is called");
	}
}
