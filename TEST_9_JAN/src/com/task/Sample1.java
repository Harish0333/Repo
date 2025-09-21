package com.task;
/*Develop a code snippet where a NullPointerException occurs due to accessing a method or property of a null object reference. 
Implement try-catch to handle this exception.*/
public class Sample1 
{

	public void checkException5()
	{
	try
	{
	String str=null;
	System.out.println(str.length());
	}
	catch(NullPointerException e)
	{
	System.out.println("Null Pointer Exception");
	}
	}
	public static void main(String[] args) 
	{
		Sample1 D=new Sample1();
		D.checkException5();
	}

}
