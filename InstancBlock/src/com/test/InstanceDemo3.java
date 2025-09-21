package com.test;

class Stuff
{
	public Stuff()
	{
		System.out.println("No Argument Constructor!!");
		
		{
			System.out.println("Instance Block");
		}	
	}
	
}

public class InstanceDemo3 
{
	public static void main(String[] args) 
	{
		new Stuff();
	}

}
