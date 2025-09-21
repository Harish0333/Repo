package com.task;

public class KeyboardResource implements AutoCloseable 
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Keyboard Resource");
	}
	
}
