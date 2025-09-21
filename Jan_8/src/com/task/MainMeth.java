package com.task;

public class MainMeth {

	public static void main(String[] args) throws Exception
	{
		NetworkResource n=new NetworkResource();
		KeyboardResource k=new KeyboardResource();
		
		try(n ; k)
		{
			 System.out.println(10/0);	
		}
		catch(ArithmeticException e)
		{
			System.err.println("Don't provide "+e.getMessage());
		}
	}
}
