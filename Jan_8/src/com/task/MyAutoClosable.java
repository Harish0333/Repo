package com.task;
import java.lang.AutoCloseable;
public class MyAutoClosable implements AutoCloseable 
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Resource closed....");		
	}
	public void display(String str)
	{
		if (str==null)
		{
			throw new RuntimeException();
		}
		else
		{
			System.out.println("Yeh,I don't have exception");
		}
	}
}
