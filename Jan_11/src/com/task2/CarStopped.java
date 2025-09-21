package com.task2;
import java.lang.Exception;
public class CarStopped extends Exception
{
	public CarStopped(String message)
	{
		super(message);
	}
}