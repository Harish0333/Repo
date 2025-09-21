package com.task;

public class ExceptionDemo4 
{
	public void checkException4()
	{ 
	 try
	 {
	String str = "Hello World";
	System.out.println(str.length());//11
	char c=str.charAt(0);
	c=str.charAt(40);
	System.out.println(c);
	}
	catch(StringIndexOutOfBoundsException s)
	{ 
	System.out.println("String Index Out Of Bounds Exception !");
	}
	}
	public static void main(String[] args) 
	{
		ExceptionDemo4 D=new ExceptionDemo4();
		D.checkException4();

	}

}
